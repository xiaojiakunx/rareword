package com.org.service.impl;

import com.org.dto.UserDTO;
import com.org.mapper.RareWordMapper;
import com.org.service.RareWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xj
 * @version: 2024/7/13
 * @description:
 */
@Service
public class RareWordServiceImpl implements RareWordService {
    @Autowired
    RareWordMapper rareWordMapper;
    @Override
    public Integer saveUserTc(UserDTO userDTO) {
        return rareWordMapper.saveUserTc(userDTO);
    }
}
