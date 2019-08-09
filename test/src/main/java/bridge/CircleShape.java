package bridge;

public class CircleShape extends Shape {
    int x, y;

    public CircleShape(int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawApi.draw(x, y);
    }


    public static void main(String[] args) {
        DrawApi greenCircle = new GreenCircle();
        DrawApi redCircle = new RedCircle();
        CircleShape circleShape = new CircleShape(1, 3, redCircle);
        circleShape.draw();
    }
}
