package lol.kent.practice.guava.bus;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.SubscriberExceptionHandler;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年12月04日 16:30
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class EventBusTest {

    private EventBus eventBus;

    public EventBusTest() {
        SubscriberExceptionHandler handler = new EventExceptionHandler();
        this.eventBus = new EventBus(handler);
        this.eventBus.register(new EventSubscriber());
    }

    public static void main(String[] args) {
        EventBusTest eventBusTest = new EventBusTest();
        System.out.println(eventBusTest.eventBus.identifier());
        EventMessage msg = new EventMessage("World", 10);
        eventBusTest.eventBus.post(msg);
    }
}
