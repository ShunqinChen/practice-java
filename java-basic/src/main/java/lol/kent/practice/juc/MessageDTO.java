package lol.kent.practice.juc;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

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
public class MessageDTO implements Delayed {

    private int id;

    private String body; // 消息内容

    private long excuteTime;// 延迟时长，这个是必须的属性因为要按照这个判断延时时长。

    public MessageDTO(int id, String body, long delayTime) {
        this.id = id;
        this.body = body;
        this.excuteTime = TimeUnit.NANOSECONDS.convert(delayTime, TimeUnit.MILLISECONDS) + System.nanoTime();
        ;
    }

    @Override
    public int compareTo(Delayed delayed) {
        MessageDTO msg = (MessageDTO) delayed;
        return Integer.valueOf(this.id) > Integer.valueOf(msg.id) ? 1
                : (Integer.valueOf(this.id) < Integer.valueOf(msg.id) ? -1 : 0);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(this.excuteTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public long getExcuteTime() {
        return excuteTime;
    }
}
