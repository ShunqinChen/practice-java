package lol.kent.practice.guava.bus;

import com.google.common.eventbus.Subscribe;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年12月04日 16:32
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class EventSubscriber {

    @Subscribe
    public void listen(EventMessage message) {
        System.out.println("时间处理中:" + message.getSourceId() + "," + message.getCount());
        throw new IllegalArgumentException("param verify error");
    }

}
