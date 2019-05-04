package com.audioclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailController {
    @GetMapping(value = "/detail")
    public String getLoginPage(Model model){
        return "/detail";
    }
}
