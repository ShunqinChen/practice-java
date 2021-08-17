package lol.kent.practice.jackson.bean;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年01月21日 17:01
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
public class DemoTableBean {

    private Map<String, Map<String, LinkedHashMap<String, String>>> param;


}
