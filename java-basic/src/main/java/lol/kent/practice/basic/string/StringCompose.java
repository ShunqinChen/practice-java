package lol.kent.practice.basic.string;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.CountDownLatch;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年12月18日 11:48
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class StringCompose {

    public static final int times = 10;


    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();
        CountDownLatch lock = new CountDownLatch(times);

        System.out.println("fire");

        for (int i = 0; i < times; i++) {
            MyThread2 t2 = new MyThread2(sb, lock);
            t2.setName("Thread-2-" + i);
            t2.start();
        }
        lock.await();
        System.out.println("end!!");

    }

    private static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
            String a = "";
            for (int i = 0; i < times; i++) {
                a = a + "A";
            }
            if (a.length() != times) {
                System.out.println("a:" + a.length());
            }

        }


    }

    private static class MyThread2 extends Thread {

        private StringBuffer sb;

        private CountDownLatch countDownLatch;


        public MyThread2(StringBuffer sb, CountDownLatch countDownLatch) {
            this.sb = sb;
            this.countDownLatch = countDownLatch;
            System.out.println(this.countDownLatch.getCount());
            this.countDownLatch.countDown();
        }

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();

            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
            LocalDateTime now = LocalDateTime.now();
            String time = df.format(now);

            sb.append("A");

            String message = "[%s] time: [%s] sb.length: %d";
            System.out.println(String.format(message, threadName, time, sb.length()));
        }
    }

}
