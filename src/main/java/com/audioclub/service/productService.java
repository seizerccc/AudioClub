package com.audioclub.service;

import com.audioclub.entity.Product;

public interface productService {
    //根据产品名获取信息
    Product selectProdByName(String name);

    //更新库存
    void updateStock(int newStock,int productid);
}
