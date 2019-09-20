package decorate;

/**
 * 被装饰对象具体实现
 */
public class CircleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个圆:");
    }
}
