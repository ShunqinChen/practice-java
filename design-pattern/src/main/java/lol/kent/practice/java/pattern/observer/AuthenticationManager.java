package lol.kent.practice.java.pattern.observer;

import java.util.Observable;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2019年04月02日 17:54
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version x.x.x
 */
public class AuthenticationManager extends Observable {


    public void authenticate(Authentication authentication) {
        setChanged();
        notifyObservers();
    }

}
