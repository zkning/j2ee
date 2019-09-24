package proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 利用ASM（开源的Java字节码编辑库，操作字节码）开源包，将代理对象类的class文件加载进来，通过修改其字节码生成子类来处理。
 * JDK代理只能对实现接口的类生成代理；CGlib是针对类实现代理，对指定的类生成一个子类，并覆盖其中的方法，这种通过继承类的实现方式，不能代理final修饰的类。
 */
public class CglibProxy implements MethodInterceptor {

    private Object targetObject;

    public Object newProxy(Object targetObject) {
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();

        // 生成目标类子类
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        return proxyObj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理拦截处理............");
        return method.invoke(targetObject, objects);
    }

    public static void main(String[] args) {
        UserManager userManager = (UserManager) new CglibProxy().newProxy(new UserManagerImpl());
        userManager.delUser("444444444444");
    }
}
