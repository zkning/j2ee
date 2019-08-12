package observer;

public abstract class Observer {

    /**
     * 主题
     */
    private WeatherSubject subject;

    /**
     * 抽象方法
     */
    public abstract void update();

    public WeatherSubject getSubject() {
        return subject;
    }

    public void setSubject(WeatherSubject subject) {
        this.subject = subject;
    }
}
