package event;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * 阅读事件源
 */
public class ReadSource {

    private String state;
    public List<EventListener> listeners;

    public ReadSource() {
        this.listeners = new ArrayList<>();
    }

    public void register(EventListener eventListener) {
        listeners.add(eventListener);
    }

    public void notifity() {
        for (EventListener eventListener : listeners) {
            ReadListener readListener = (ReadListener) eventListener;
            readListener.handle(new ReadEvent(this));
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifity();
    }
}
