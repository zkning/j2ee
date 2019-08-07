package observer;

import javax.security.auth.Subject;

public abstract class Observer {

    private WeatherSubject subject;

    public abstract void update();

    public WeatherSubject getSubject() {
        return subject;
    }

    public void setSubject(WeatherSubject subject) {
        this.subject = subject;
    }
}
