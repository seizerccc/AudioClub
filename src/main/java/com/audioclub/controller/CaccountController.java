package com.audioclub.controller;

import com.audioclub.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CaccountController {
    @Autowired
    private customerService custService;


    @GetMapping(value = "/caccount")
    public String getLoginPage(Model model){
        return "/caccount";
    }
}
