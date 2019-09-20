package event;


import java.util.EventListener;

/**
 * 监听器
 */
public class ReadListener implements EventListener {


    public void doRead(ReadEvent readEvent) {
        ReadSource readSource = (ReadSource) readEvent.getSource();
        System.out.println("ReadListener event state ：" + readSource.getState());
    }

    public static void main(String[] args) {
        ReadSource readSource = new ReadSource();
        ReadListener readListener = new ReadListener();
        readSource.register(readListener);
        readSource.setState("修改了状态!!1");
    }
}
