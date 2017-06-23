package com.kingbbode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by YG-MAC on 2017. 6. 23..
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public void home(){

    }
}
