package bridge;

public abstract class Shape {

    DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    abstract void draw();
}
