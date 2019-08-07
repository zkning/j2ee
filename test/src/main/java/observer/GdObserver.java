package observer;

/**
 * 监听器
 */
public class GdObserver extends Observer {

    public GdObserver(WeatherSubject weatherSubject) {

        // 设置主题
        this.setSubject(weatherSubject);

        // 关联当前监听
        weatherSubject.register(this);
    }

    @Override
    public void update() {
        System.out.println("状态已变更：" + this.getSubject().getState());
    }

    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        new GdObserver(weatherSubject);
        weatherSubject.setState("chifanla");
    }
}
