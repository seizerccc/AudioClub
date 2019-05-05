package com.audioclub.service.impl;

import com.audioclub.entity.Order;
import com.audioclub.dao.orderDAO;
import com.audioclub.service.orderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderService")//声明以下类作为Service注入
public class orderServiceImpl implements orderService {
    @Resource
    private orderDAO orderDao;//dao层处理类，自动寻找bean注入

    @Override
    public void insertOrder(Order order) {
        orderDao.insertOrder(order);
    }

    @Override
    public void deleteOrder(int customerid, int productid, String ordertime) {
        orderDao.deleteOrder(customerid,productid,ordertime);
    }

    @Override
    public List<Order> selectCustOrder(int customerid) {
        return orderDao.selectCustOrder(customerid);
    }

    @Override
    public List<Order> selectAllOrder() {
        return orderDao.selectAllOrder();
    }

    @Override
    public void updateOrder(int customerid, int productid, String ordertime) {
        orderDao.updateOrder(customerid,productid,ordertime);
    }
}
