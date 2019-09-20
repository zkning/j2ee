package observer;


/**
 *  观察者 -> 主题 （一对一）
 *  监听并接收主题状态变更
 */
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
