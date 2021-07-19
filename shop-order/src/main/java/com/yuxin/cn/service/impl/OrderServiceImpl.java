package com.yuxin.cn.service.impl;


import com.yuxin.cn.dao.OrderDao;
import com.yuxin.cn.domain.Order;
import com.yuxin.cn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public void createOrder(Order order) {
        orderDao.save(order);
    }
}
