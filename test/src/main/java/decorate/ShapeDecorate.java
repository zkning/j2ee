package decorate;

public abstract class ShapeDecorate implements Shape {

    public Shape shape;

    public ShapeDecorate(Shape shape) {
        this.shape = shape;
    }

    ;
}
