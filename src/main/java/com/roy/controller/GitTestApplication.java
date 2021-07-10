package com.roy.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * @ClassName: GitTestApplication
 * @Description:
 * @Auther: lairf
 * @Date: 2021/7/10  11:40
 * @version : 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.roy"})
public class GitTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class,args);
    }
}