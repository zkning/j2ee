package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题
 *
 * 主题 -> 观察者 （一对多）
 * 主题状态变更发送更新通知观察者
 */
public class WeatherSubject {

    /**
     * 观察者对象集合
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 主题状态
     */
    private String state;

    /**
     * 提供注册方法
     * @param observer
     */
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

        // 主题状态变更后通知观察者
        broadcast();
    }

    private void broadcast() {
        this.observerList.forEach(item -> {
            item.update();
        });
    }
}
