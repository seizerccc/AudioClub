package com.audioclub.dao;

import com.audioclub.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface orderDAO {
    //增加订单
    void insertOrder(@Param("order")Order order);

    //删除订单
    void deleteOrder(int customerid, int productid, String ordertime);

    //查询用户订单
    List<Order> selectCustOrder(int customerid);

    //查询所有订单
    List<Order> selectAllOrder();

    //处理订单
    void updateOrder(int customerid, int productid, String ordertime);
}
