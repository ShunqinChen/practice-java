package lol.kent.java.pattern.observer;

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
public class AuthorizationProvider implements Observer {

    public AuthorizationProvider(AuthenticationManager manager) {
        super();
        manager.addObserver(this::update);
    }
    @Override
    public void update(Observable o, Object arg) {
        authentication(((AuthenticationManager) o).getAuthentication());
    }

    public void authentication(Authentication authentication) {
        System.out.println("Authentication:"+authentication.getUserName());
    }
}
