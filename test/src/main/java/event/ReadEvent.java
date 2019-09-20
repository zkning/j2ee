package event;


import java.util.EventObject;

/**
 * 时间
 */
public class ReadEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ReadEvent(ReadSource source) {
        super(source);
    }
}
