package lol.kent.practice;

import lol.kent.practice.beans.UserDTO;
import lol.kent.practice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

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
@Mapper
public interface UserBeanMapper {

    UserBeanMapper instance = Mappers.getMapper(UserBeanMapper.class);

    @Mapping(source = "createdAt", target = "time", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(source = "addresses", target = "addresses")
    UserDTO user2userDTO(User user);
}
