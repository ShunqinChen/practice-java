package lol.kent.practice.java.pattern.listener;

import java.util.EventListener;

/**
 * 标题、简要说明. <br>
 * 监听器
 * <p>
 * Copyright: Copyright (c) 2019年04月02日 11:32
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version x.x.x
 */
public class AuthenticationProvider implements EventListener {

    public void authenticate(Authentication loginEvent) {
        System.out.println("Authentication processing");
        checkPassword();
    }


    public void checkPassword() {
        System.out.println("check password after login happened");
    }
}
