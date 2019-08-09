package bridge;

public class GreenCircle implements DrawApi {

    @Override
    public void draw(int x, int y) {
        System.out.println("画绿色圆：X=" + x + ",y=" + y);
    }
}
