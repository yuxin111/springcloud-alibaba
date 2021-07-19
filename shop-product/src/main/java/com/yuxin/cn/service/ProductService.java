package com.yuxin.cn.service;


import com.yuxin.cn.domain.Product;

public interface ProductService {
    //根据pid查询商品信息
    Product findByPid(Integer pid);


    void reduceInventory(Integer pid, Integer number);
}
