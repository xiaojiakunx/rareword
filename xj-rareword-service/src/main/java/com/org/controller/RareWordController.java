package com.org.controller;

import com.org.dto.UserDTO;
import com.org.service.RareWordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xj
 * @version: 2024/7/13
 * @description:
 */
@RestController
@Slf4j
public class RareWordController {
    @Autowired
    RareWordService rareWordService;

    @RequestMapping("/rare/word")
    public Integer saveUserTc(@RequestBody UserDTO userDTO){

        return rareWordService.saveUserTc(userDTO);
    }
}
