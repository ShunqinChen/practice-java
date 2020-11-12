package lol.kent.practice.entity;

import java.util.Date;
import lol.kent.practice.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年11月12日 14:28
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;

    private Date createdAt;

    private Address address;

    private GenderEnum gender;
}
