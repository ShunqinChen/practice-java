package lol.kent.practice.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.format.DateTimeFormatter;
import lol.kent.practice.jackson.bean.DateFormatBean;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年08月17日 14:22
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class DateFormatTest {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        //language=JSON5
        String time = "{\"time\":\"2021-08-21\"}";

        try {
            DateFormatBean obj = objectMapper.readValue(time, DateFormatBean.class);

            System.out.println(obj.getTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
