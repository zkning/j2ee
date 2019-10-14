package test;

/**
 * Hello world!
 */
public class App {

    // 静态块类未初始化
    static {
        System.out.println("ConstClass init!");

        // 解析: 将符号引用（对象未进入内存，可以定位到目标）转为直接引用（对象已进入内存）
        String a = App.HELLOWORLD;
        System.out.println( " >>>>> " + a);
    }

    // 准备： 为变量分配内存（仅static）并设置初始值（由final修饰直接为指定值，否则为变量初始值）
    public static final String HELLOWORLD = "hello world";
}

class NotInitialization {
    public static void main(String[] args) {
        App app = new App();
    }
}
