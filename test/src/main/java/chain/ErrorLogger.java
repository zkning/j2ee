package chain;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String msg) {
        System.out.println("error:" + msg);
    }
}
