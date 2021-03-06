package com.tts.capstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value="/")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/about")
    public String about(){
        return "about";
    }

    @GetMapping(value = "/donate")
    public String donate(){
        return "donate";
    }

    @GetMapping(value = "/volunteer")
    public String volunteer(){
        return "volunteer";
    }

    @GetMapping(value = "/help")
    public String help(){
        return "help";
    }

    @GetMapping(value = "/media")
    public String media(){
        return "media";
    }

}

