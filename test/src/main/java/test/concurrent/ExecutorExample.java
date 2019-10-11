package test.concurrent;

import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args) {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 5, 20, TimeUnit.HOURS, new LinkedBlockingQueue<Runnable>(), threadFactory);

        // 定期任务(2秒后开始执行，按2秒定期执行)
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("执行任务");
        }, 2, 2, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue<String>();
        linkedBlockingQueue.offer("1");
        System.out.println(linkedBlockingQueue.poll());
        // 返回队列头部元素
        System.out.println(linkedBlockingQueue.peek());

    }
}
