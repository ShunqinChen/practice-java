package lol.kent.practice.basic.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <pre>
 *    类描述: 线程栅栏CyclicBarrier测试
 *       CyclicBarrier: 工作机制
 *          启动 n 个线程，与栅栏阀值一致，即当线程准备数达到要求时，栅栏刚好开启，从而达到统一控制效果
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

    public static final int TIMES = 10;

    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(TIMES);
        for (int i = 0; i < TIMES; i++) {
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
            System.out.println(this.barrier.getNumberWaiting());
        }

        public void run() {
            String messageFormat = "[%s] - [%s]";
            String threadName = Thread.currentThread().getName();
            String message = String.format(messageFormat, threadName, System.currentTimeMillis());

            System.out.println(message + " is ready...");
            // 这里最后一个会直接执行,因为线程已经齐了
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
