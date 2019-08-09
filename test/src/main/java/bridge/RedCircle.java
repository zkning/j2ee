package bridge;

public class RedCircle implements DrawApi {

    @Override
    public void draw(int x, int y) {
        System.out.println("画红色圆：X=" + x + ",y=" + y);
    }


}
