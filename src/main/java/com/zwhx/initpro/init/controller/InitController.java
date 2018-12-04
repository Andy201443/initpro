package com.zwhx.initpro.init.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @RequestMapping(path = {"/initBoot"})
    public String InitBoot (){
        System.out.println("init spring boot");
        return "init spring boot";
    }

}
