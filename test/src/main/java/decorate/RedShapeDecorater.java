package decorate;

/**
 * 装饰器具体实现
 */
public class RedShapeDecorater extends AbsShapeDecorate {

    public RedShapeDecorater(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("红色装饰器处理....");
        shape.draw();
    }

    /**
     * 装饰器可变更被装饰对象（interface）
     * @param args
     */
    public static void main(String[] args) {
        Shape shape = new CircleShape();
        RedShapeDecorater redShapeDecorater = new RedShapeDecorater(shape);
        redShapeDecorater.draw();
    }
}
