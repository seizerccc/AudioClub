package com.audioclub.controller;

import com.audioclub.entity.Product;
import com.audioclub.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class CatagoryController {

    @Autowired
    private productService prodService;



    @GetMapping(value = "/catagory")
    public String getLoginPage(Model model){
        return "/catagory";
    }

    @PostMapping(value = "/catagory")
    @ResponseBody
    public Object login(@RequestParam(required = false, value = "prodname") String prodname,
                        HttpSession session)
    {


        //根据登入名字判断此用户是否存在
        Product prod = prodService.selectProdByName(prodname);

        if(prod == null)
        {
            Integer i =0;//读取书本信息失败
            return i;
        }
        else
        {
            session.setAttribute("currProduct",prod);
            Integer i =1;
            return i;
        }
    }
}
