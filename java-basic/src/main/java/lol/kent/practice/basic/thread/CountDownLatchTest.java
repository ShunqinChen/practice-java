package lol.kent.practice.basic.thread;

import java.util.concurrent.CountDownLatch;
import org.joda.time.DateTime;

/**
 * <pre>
 *    类描述: 线程执行寄存锁CountDownLatch
 *      CountDownLatch 执行过程
 *          启动n个线程,在n个线程中设置count down 当计数器归0时,解锁主线程的await
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年12月20日 15:31
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class CountDownLatchTest {

    public static final int TIMES = 10;

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(TIMES);
        for (int i = 0; i < TIMES; i++) {
            Thread.sleep(1000);
            PrintThread t = new PrintThread("Thread-" + i, latch);
            t.start();
        }
        latch.await();
        System.out.println("finished");
    }

    public static class PrintThread extends Thread {

        private CountDownLatch countDownLatch;

        public PrintThread(String name, CountDownLatch countDownLatch) {
            super(name);
            this.countDownLatch = countDownLatch;
            System.out.println(this.countDownLatch.getCount());
        }

        @Override
        public void run() {
            String messageFormat = "[%s] - [%s] ";
            String threadName = Thread.currentThread().getName();
            String time = new DateTime().toString("yyyy-MM-dd HH:mm:ss.SSS");

            String message = String.format(messageFormat, threadName, time);
            System.out.println(message + "ready......");
            this.countDownLatch.countDown();
            System.out.println(message + "stated......");
        }
    }


}
