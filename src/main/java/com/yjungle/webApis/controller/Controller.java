package com.yjungle.webApis.controller;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String home(){
        return "It works!";
    }


}
