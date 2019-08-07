package chain;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String msg) {
        System.out.println("info:" + msg);
    }
    public static void main(String[] args) {
        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger info = new InfoLogger(AbstractLogger.INFO);
        info.setNext(error);
        AbstractLogger debug = new DebugLogger(AbstractLogger.DEBUG);
        debug.setNext(info);

        debug.sendMsg(AbstractLogger.INFO,"这是最高级别的日志");
    }
}
