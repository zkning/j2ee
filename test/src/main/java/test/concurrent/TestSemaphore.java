package test.concurrent;

import java.util.concurrent.Semaphore;

public class TestSemaphore {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3, true);
        for (int i = 0; i < 10; i++) {
            new Thread(new Queue(semaphore, i)).start();
        }
    }
}

class Queue implements Runnable {

    private Integer index;
    private Semaphore semaphore;

    public Queue(Semaphore semaphore, Integer index) {
        this.index = index;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println("开始排队了....");
            semaphore.acquire();
            System.out.println("当前处理序号......." + index);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
            System.out.println("当前处理完成序号......." + index);
        }
    }
}