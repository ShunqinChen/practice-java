package lol.kent.java.pattern.listener;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 标题、简要说明. <br>
 * 监听事件源
 * <p>
 * Copyright: Copyright (c) 2019年04月02日 11:30
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version x.x.x
 */
public class AuthenticationManager {

    private List<AuthenticationProvider> providers = Lists.newArrayList();

    public AuthenticationManager() {
    }

    public AuthenticationManager(List<AuthenticationProvider> providers) {
        this.providers = providers;
    }

    public void addProvider(AuthenticationProvider provider) {
        this.providers.add(provider);
    }

    public void login() {
        providers.stream().forEach(provider-> provider.authenticate(new Authentication(this)));
    }
}
