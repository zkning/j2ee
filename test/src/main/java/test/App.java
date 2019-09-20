package test;

/**
 * Hello world!
 */
public class App {

    static
    {
        System.out.println("ConstClass init!");
    }
    public static  final String HELLOWORLD = "hello world";
}

  class NotInitialization
{
    public static void main(String[] args)
    {
        System.out.println(App.HELLOWORLD);
    }
}
