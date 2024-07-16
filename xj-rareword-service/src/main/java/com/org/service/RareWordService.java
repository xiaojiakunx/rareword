package com.org.service;

import com.org.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: xj
 * @version: 2024/7/13
 * @description:
 */
public interface RareWordService {
    Integer saveUserTc( UserDTO userDTO);
}
