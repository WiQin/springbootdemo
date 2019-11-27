package com.wyw.boot.controller;

import com.wyw.boot.config.JavaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyw
 * @date 2019/11/13
 */
@RestController
public class ControllerDemo {

    @Autowired
    JavaConfig config;

    @RequestMapping("/index")
    public String index(){
        return "spring boot test";
    }
}
