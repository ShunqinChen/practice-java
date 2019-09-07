package lol.kent.practice.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2019年04月02日 17:56
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version x.x.x
 */
public class AuthenticationProvider implements Observer {

    public AuthenticationProvider(AuthenticationManager manager) {
        super();
        manager.addObserver(this::update);
    }

    @Override
    public void update(Observable o, Object arg) {
        authorization(((AuthenticationManager) o).getAuthentication());
    }

    public void authorization(Authentication authentication) {
        System.out.println("Authorization :".concat(authentication.getUserName()));
    }
}
