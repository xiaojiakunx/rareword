package com.org.mapper;

import com.org.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: xj
 * @version: 2024/7/13
 * @description:
 */
@Mapper
public interface RareWordMapper {
    Integer saveUserTc(UserDTO userDTO);

}
