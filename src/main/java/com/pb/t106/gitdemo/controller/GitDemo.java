package com.pb.t106.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 演示代码冲突
@RestController
public class GitDemo {

    @GetMapping("/demo1")
    public String demo1(){
        System.out.print("hhehe");
        return "demo";
    }

    /**
     *
     * @return demo2
     */
    @GetMapping("/demo2")
    public String demo2(){
        return "demo2";
    }


}
