package test.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {

    public static void main(String[] args) {
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        for (int i = 0; i < 24; i++) {
            System.out.println(i + 1 +"次数");
            final int finalI = i;
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println("任务：" + finalI + "已准备");
                        cyclicBarrier.await();
                        System.out.println("任务：" + finalI + "开始执行了");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        System.out.println("已全部执行完成。。");
    }
}
