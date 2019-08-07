package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题
 */
public class WeatherSubject {
    private List<Observer> observerList = new ArrayList<>();
    private String state;

    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        broadcast();
    }

    private void broadcast() {
        this.observerList.forEach(item -> {
            item.update();
        });
    }
}
