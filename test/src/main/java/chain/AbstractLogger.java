package chain;

public abstract class AbstractLogger {

    public static final int ERROR = 1;
    public static final int INFO = 2;
    public static final int DEBUG = 3;

    protected AbstractLogger abstractLogger;
    protected int level;

    public void setNext(AbstractLogger next) {
        this.abstractLogger = next;
    }

    public void sendMsg(int level, String msg) {
        if (this.level == level) {
            write(msg);
            return;
        }
        if (null != abstractLogger)
            this.abstractLogger.sendMsg(level, msg);
    }

    abstract void write(String msg);
}
