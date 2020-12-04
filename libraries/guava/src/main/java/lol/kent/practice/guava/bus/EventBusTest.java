package lol.kent.practice.guava.bus;

import com.google.common.eventbus.EventBus;

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
        this.eventBus = new EventBus("inventory_log_bus");
        this.eventBus.register(new EventSubscriber());
    }

    public static void main(String[] args) {
        EventBusTest eventBusTest = new EventBusTest();

        EventMessage msg = new EventMessage("World", 10);
        eventBusTest.eventBus.post(msg);
    }
}
