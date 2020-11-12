package lol.kent.practice;

import java.util.Arrays;
import java.util.Date;
import lol.kent.practice.beans.UserDTO;
import lol.kent.practice.entity.Address;
import lol.kent.practice.entity.User;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年11月12日 14:27
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class TestMain {

    public static void main(String[] args) {
        Address address = Address.builder()
                .province("Fujian")
                .city("Ximen")
                .district("SiMing")
                .build();
        User i = User.builder()
                .createdAt(new Date())
                .name("Kent")
                .addresses(Arrays.asList(address))
                .build();
        UserBeanMapper beanMapper = UserBeanMapper.instance;
        UserDTO userDTO = beanMapper.user2userDTO(i);
        System.out.println(userDTO.getTime());
        System.out.println(userDTO.getName());
        System.out.println(userDTO.getAddresses());
    }
}
