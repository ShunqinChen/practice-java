package lol.kent.practice.java8;

import java.util.Optional;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年01月09日 12:30
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class OptionalTests {

    public static void main(String[] args) {
        Optional<String> none = Optional.ofNullable(null);
        none.orElseThrow(() -> new RuntimeException("测试null值抛出异常"));

    }

}
