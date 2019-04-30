package com.pb.t106.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitDemo {

    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }

}
