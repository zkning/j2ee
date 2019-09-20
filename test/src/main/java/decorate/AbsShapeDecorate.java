package decorate;

public abstract class AbsShapeDecorate implements Shape {

    public Shape shape;

    public AbsShapeDecorate(Shape shape) {
        this.shape = shape;
    }
}
