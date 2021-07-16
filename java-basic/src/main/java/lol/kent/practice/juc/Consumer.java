package lol.kent.practice.juc;

import java.util.concurrent.DelayQueue;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年06月24日 18:42
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class Consumer implements Runnable {

    private DelayQueue<MessageDTO> queue;

    public Consumer(DelayQueue<MessageDTO> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                MessageDTO take = queue.take();
                System.out.println("消费消息id：" + take.getId() + " 消息体：" + take.getBody());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
