package com.frankie.playspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yao Frankie
 * @date: 2020/3/23 11:01
 */
@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "yyc") String name){
        return "Hello " + name;
    }
}
