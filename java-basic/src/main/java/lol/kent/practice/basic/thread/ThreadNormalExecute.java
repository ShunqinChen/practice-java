package lol.kent.practice.basic.thread;

import org.joda.time.DateTime;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年12月20日 16:25
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class ThreadNormalExecute {

    public static final int TIMES = 10;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < TIMES; i++) {
            Thread.sleep(1000);
            Thread t = new Thread(new PrintThread());
            t.start();
        }
        System.out.println("finished");
    }

    public static class PrintThread implements Runnable {

        @Override
        public void run() {
            String messageFormat = "[%s] - [%s] ";
            String threadName = Thread.currentThread().getName();
            String time = new DateTime().toString("yyyy-MM-dd HH:mm:ss.SSS");
            String message = String.format(messageFormat, threadName, time);

            System.out.println(message + "ready......");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message + "started......");
        }
    }
}
