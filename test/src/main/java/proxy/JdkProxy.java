package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 利用反射机制生成一个实现代理接口的匿名类，在调用具体方法前调用InvokeHandler来处理。
 */
public class JdkProxy implements InvocationHandler {

    private Object proxyObject;

    public Object newJdkProxy(Object proxyObject) {
        this.proxyObject = proxyObject;

        // 返回代理对象
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(), proxyObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK invoke处理业务。。。。");
        return method.invoke(proxyObject, args);
    }

    public static void main(String[] args) {
        UserManager userManager = (UserManager) new JdkProxy().newJdkProxy(new UserManagerImpl());
        userManager.delUser("ning");
    }
}
