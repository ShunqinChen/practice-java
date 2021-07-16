package lol.kent.practice.juc;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年06月24日 18:39
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class DelayQueueTest {

    public static void main(String[] args) {
        // 创建延时队列
        DelayQueue<MessageDTO> queue = new DelayQueue<MessageDTO>();
        // 添加延时消息,m1 延时3s
        MessageDTO m1 = new MessageDTO(1, "world", 3000);
        // 添加延时消息,m2 延时10s
        MessageDTO m2 = new MessageDTO(2, "hello", 10000);
        //将延时消息放到延时队列中
        queue.offer(m2);
        queue.offer(m1);
        // 启动消费线程 消费添加到延时队列中的消息，前提是任务到了延期时间
        ExecutorService exec = Executors.newFixedThreadPool(1);
        exec.execute(new Consumer(queue));
        exec.shutdown();
    }
}
