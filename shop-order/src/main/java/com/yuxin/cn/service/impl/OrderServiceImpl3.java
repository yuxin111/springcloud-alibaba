package com.yuxin.cn.service.impl;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.yuxin.cn.dao.OrderDao;
import com.yuxin.cn.domain.Order;
import com.yuxin.cn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl3 {

    // 定义资源 指定资源名称
    @SentinelResource("message")
    public String message(){
        return "message";
    }
}
