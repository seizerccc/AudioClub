package com.audioclub.controller;


import com.audioclub.entity.Order;
import com.audioclub.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MorderController {
    @Autowired
    private orderService orderservice;

    @GetMapping(value = "/morder")
    public String getLoginPage(Model model, HttpSession session){
        List<Order> orders = orderservice.selectAllOrder();
        session.setAttribute("currOrders",orders);

        return "/morder";
    }

    @PostMapping(value = "/morder")
    @ResponseBody
    public Object order(@RequestParam(required = false, value = "customerid") int customerid,
                        @RequestParam(required = false, value = "productid") int productid,
                        @RequestParam(required = false, value = "ordertime") String ordertime,
                        HttpSession session)
    {
        Integer i = -1;

        orderservice.updateOrder(customerid,productid,ordertime);
        return i;
    }
}
