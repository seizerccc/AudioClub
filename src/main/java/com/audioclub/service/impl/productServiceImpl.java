package com.audioclub.service.impl;

import com.audioclub.dao.productDAO;
import com.audioclub.entity.Product;
import com.audioclub.service.productService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("productService")//声明以下类作为Service注入
public class productServiceImpl implements productService {

    @Resource
    private productDAO productDao;//dao层处理类，自动寻找bean注入

    @Override
    public Product selectProdByName(String name) {

        return productDao.selectProdByName(name);
    }

    @Override
    public void updateStock(int newStock,int productid) {
        productDao.updateStock(newStock,productid);
    }
}
