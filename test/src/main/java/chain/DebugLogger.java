package chain;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String msg) {
        System.out.println("debug:" + msg);
    }
}
