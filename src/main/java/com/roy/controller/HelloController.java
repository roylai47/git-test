package com.roy.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @ClassName: HelloController
 * @Description:
 * @Auther: lairf
 * @Date: 2021/7/10  11:32
 * @version : 1.0
 */
@RestController
@Api("hello")
public class HelloController {

    @GetMapping("roy/hello")
    public String hello() {
        return "hello roy";
    }
}