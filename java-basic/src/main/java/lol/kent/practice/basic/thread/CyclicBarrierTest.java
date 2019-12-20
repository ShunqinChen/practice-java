package lol.kent.practice.basic.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <pre>
 *    类描述: 线程栅栏CyclicBarrier测试
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年12月20日 15:31
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 * @see <link src="https://www.cnblogs.com/yougewe/p/9745198.html"/>
 */
public class CyclicBarrierTest {

    public static final int times = 10;

    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(times);
        for (int i = 0; i < times; i++) {
            Thread.sleep(1000);
            Thread thread = new Thread(new PrintThread(cyclicBarrier), "Thread-" + i);
            thread.start();
        }

        System.out.println("end");
    }

    public static class PrintThread implements Runnable {

        private CyclicBarrier barrier;

        public PrintThread(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            String messageFormat = "[%s] - [%s]";
            String threadName = Thread.currentThread().getName();
            String message = String.format(messageFormat, threadName, System.currentTimeMillis());

            System.out.println(message + " is ready...");
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(message + " started...");
        }
    }
}
