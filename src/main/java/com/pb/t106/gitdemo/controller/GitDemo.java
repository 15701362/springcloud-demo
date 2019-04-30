package com.pb.t106.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 演示代码冲突
@RestController
public class GitDemo {

    @GetMapping("/demo")
    public String demo(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
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
