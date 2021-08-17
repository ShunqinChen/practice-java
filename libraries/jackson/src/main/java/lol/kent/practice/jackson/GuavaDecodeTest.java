package lol.kent.practice.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import lol.kent.practice.jackson.bean.DemoTableBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年01月21日 16:54
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
@Slf4j
public class GuavaDecodeTest {

    private Map<String, Map<String, LinkedHashMap<String, String>>> param = new HashMap<String, Map<String, LinkedHashMap<String, String>>>();

    @Before
    public void init() {

        final String code = "SMS123485906";
        LinkedHashMap<String, String> msgParam1 = new LinkedHashMap<String, String>();
        msgParam1.put("name", "Kent");
        msgParam1.put("age", "30");

        LinkedHashMap<String, String> msgParam2 = new LinkedHashMap<String, String>();
        msgParam2.put("name", "Bob");
        msgParam2.put("age", "29");

        param.put("18959678966", Map.of(code, msgParam1));
        param.put("15859237640", Map.of(code, msgParam2));
    }

    @Test
    public void testTableNative() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new GuavaModule());
        String ret = objectMapper.writeValueAsString(param);
        log.info(ret);
    }

    @Test
    public void testWithDTO() throws JsonProcessingException {
        DemoTableBean obj = new DemoTableBean();
        obj.setParam(param);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new GuavaModule());
        String ret = objectMapper.writeValueAsString(param);
        System.out.println(ret);
    }

    /**
     * 结论: 没有找到合适的TABLE DECODE方法, Jackson做了encode,但是decode好像没有找到很稳定的实现
     *
     * @throws JsonProcessingException .
     */
    @Test
    public void testDecodeStr() throws JsonProcessingException {
        String input = "{\"param\":{\"18959678966\":{\"SMS123485906\":{\"name\":\"Kent\",\"age\":\"30\"}},\"15859237640\":{\"SMS123485906\":{\"name\":\"Bob\",\"age\":\"29\"}}}}";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new GuavaModule());
        DemoTableBean obj = objectMapper.readValue(input, DemoTableBean.class);
        System.out.println(obj.toString());
    }
}
