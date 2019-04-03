package lol.kent.practice.java.pattern.listener;

/**
 * 标题、简要说明. <br>
 * 监听模式测试入口
 * <p>
 * Copyright: Copyright (c) 2019年04月02日 11:29
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version x.x.x
 * @see <a href="https://www.cnblogs.com/jenkov/p/listener_in_java.html"></a>
 */
public class Bootstrap {

    public static void main(String[] args) {
        AuthenticationManager manager = new AuthenticationManager();
        AuthenticationProvider provider = new AuthenticationProvider();
        manager.addProvider(provider);
        manager.login();
    }
}
