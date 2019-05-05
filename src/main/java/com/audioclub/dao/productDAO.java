package com.audioclub.dao;

import com.audioclub.entity.Product;

public interface productDAO {
    //根据产品名获取信息
    Product selectProdByName(String name);

    //更新库存
    void updateStock(int newStock,int productid);
}
