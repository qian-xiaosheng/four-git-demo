package com.yida.fourgitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/yida")
    public String hello() {
        System.out.println("我有一个想法！");
        return "宜达互联";
    }
}
