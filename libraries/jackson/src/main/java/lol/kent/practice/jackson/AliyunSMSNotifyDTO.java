package lol.kent.practice.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年01月23日 14:23
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
@Data
@Builder
public class AliyunSMSNotifyDTO {

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("send_time")
    private String sendTime;

    @JsonProperty("report_time")
    private String reportTime;

    private Boolean success;

    @JsonProperty("err_code")
    private String errCode;

    @JsonProperty("err_msg")
    private String errMsg;

    @JsonProperty("sms_size")
    private String smsSize;

    @JsonProperty("biz_id")
    private String bizId;

    @JsonProperty("out_id")
    private String outId;

    @Tolerate
    public AliyunSMSNotifyDTO() {
    }
}
