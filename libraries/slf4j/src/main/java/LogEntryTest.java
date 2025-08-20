import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年08月07日 11:17
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class LogEntryTest {

    private static final Logger logger = LoggerFactory.getLogger(LogEntryTest.class);

    public static void main(String[] args) {
        var name = "Kent";
        var param = Map.of("name", "Kent");
        var list = List.of("Kent", "Bob");
        var product = "雨伞";
        var user = new User("Kent", 30);
        logger.info("user:{}", user);
    }

}
