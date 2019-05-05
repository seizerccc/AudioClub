package com.audioclub.controller;

import com.audioclub.entity.Customer;
import com.audioclub.entity.Order;
import com.audioclub.entity.Product;
import com.audioclub.service.orderService;
import com.audioclub.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DetailController {

    @Autowired
    private orderService orderservice;

    @Autowired
    private productService prodService;

    @GetMapping(value = "/detail")
    public String getLoginPage(Model model){
        return "/detail";
    }

    @PostMapping(value = "/detail")
    @ResponseBody
    public Object order(@RequestParam(required = false, value = "message") int message,
                        HttpSession session)
    {
        Integer i =-1;
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String ordertime = formatter.format(currentTime);

        Product product = (Product)session.getAttribute("currProduct");
        Customer customer = (Customer)session.getAttribute("currCustomer");
        Order order=new Order();

        order.setCustomerid(customer.getCustomerid());
        order.setProductid(product.getProductid());
        order.setOrdertime(ordertime);
        order.setQuantity(1);
        order.setStatu("未处理");

        if(message==1){
            if(product.getStock()>0){
                orderservice.insertOrder(order);
                prodService.updateStock(product.getStock()-1,product.getProductid());
                i=0;

                return i;
            }
            else{
                i=1;
                return i;
            }
        }
        return i;
    }
}
