package decorate;

public class RedShapeDecorater extends ShapeDecorate {


    public RedShapeDecorater(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("红色装饰器");
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape = new CircleShape();
        RedShapeDecorater redShapeDecorater = new RedShapeDecorater(shape);
        redShapeDecorater.draw();
    }
}
