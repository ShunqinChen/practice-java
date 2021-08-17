package lol.kent.practice.jackson.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import lombok.Data;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2021年08月17日 14:24
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
@Data
public class DateFormatBean {

    /**
     * <pre>
     * - LocalDateTime需要jackson-datatype-jsr310库的支持,否则报错. jackson-datatype-jsr310在2.8.5版本后归入jackson-datatype-jdk8
     * - pattern的格式和JSON中该字段的格式需要一致,否则无法转换. 比如: 2019-02-21 使用pattern yyyy-MM-dd HH:mm:ss无法接收. 但是JSON中的格式较长, 比如在json中为2021-11-21 11:32:11那么转换成对象是可以的
     * - 在尝试引入jackson-datatype-jdk8后, 发现localDateTime会报错,改为使用LocalDate后无此问题
     * </pre>
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate time;
}
