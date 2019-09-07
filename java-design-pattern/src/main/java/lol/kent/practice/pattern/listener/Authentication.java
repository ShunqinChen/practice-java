package lol.kent.practice.pattern.listener;

import java.util.EventObject;

/**
 * 标题、简要说明. <br>
 * 监听器驱动的对应事件
 * <p>
 * Copyright: Copyright (c) 2019年04月02日 11:33
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version x.x.x
 */
public class Authentication extends EventObject {



    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public Authentication(Object source) {
        super(source);
        System.out.println("Login event happened");
    }


}
