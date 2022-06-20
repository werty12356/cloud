package com.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wdy
 * @version 1.0
 * @date 2022/6/17 15:19
 */

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("test")
    public void test(){
        System.out.println("111111");
    }
}
