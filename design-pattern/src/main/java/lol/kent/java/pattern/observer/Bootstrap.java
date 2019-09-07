package lol.kent.java.pattern.observer;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2019年04月02日 18:11
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version x.x.x
 */
public class Bootstrap {

    public static void main(String[] args) {
        AuthenticationManager manager = new AuthenticationManager();
        AuthenticationProvider authenticationProvider = new AuthenticationProvider(manager);
        AuthorizationProvider authorizationProvider = new AuthorizationProvider(manager);


        Authentication authentication = new Authentication("Kent","password");
        manager.authenticate(authentication);
        // 删除观察者后，观察者将收不到活动通知
        manager.deleteObserver(authenticationProvider);
        manager.authenticate(new Authentication("Bob", "123456"));
    }

}
