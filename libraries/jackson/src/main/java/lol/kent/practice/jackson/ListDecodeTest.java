package lol.kent.practice.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年01月23日 14:52
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */

public class ListDecodeTest {

    @Test
    public void testDecodeList() throws JsonProcessingException {
        String s = "[{\"phone_number\":\"13900000001\",\"send_time\":\"2017-01-01 00:00:00\",\"report_time\":\"2017-01-01 00:00:00\",\"success\":true,\"err_code\":\"DELIVERED\",\"err_msg\":\"用户接收成功\",\"sms_size\":\"1\",\"biz_id\":\"12345\",\"out_id\":\"67890\"}]";
        ObjectMapper objectMapper = new ObjectMapper();
        List<AliyunSMSNotifyDTO> list = objectMapper.readValue(s, new TypeReference<List<AliyunSMSNotifyDTO>>() {
        });

        System.out.println(list.get(0).getPhoneNumber());
        Assert.assertTrue("decode fail", list.get(0).getPhoneNumber().equalsIgnoreCase("13900000001"));
    }
}
