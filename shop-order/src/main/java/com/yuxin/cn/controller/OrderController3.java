package com.yuxin.cn.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.fastjson.JSON;
import com.yuxin.cn.config.FilePersistence;
import com.yuxin.cn.domain.Order;
import com.yuxin.cn.domain.Product;
import com.yuxin.cn.service.OrderService;
import com.yuxin.cn.service.ProductService;
import com.yuxin.cn.service.impl.OrderServiceImpl3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Slf4j
public class OrderController3 {

    @Autowired
    private OrderServiceImpl3 orderServiceImpl3;
    int i = 0;

    @RequestMapping("/order/message1")
    public String message1() {
//        i++;
//        if (i % 3 == 0) {
//            throw new RuntimeException();
//        }
//        orderServiceImpl3.message();
        return "message1";
    }

    @RequestMapping("/order/message2")
    public String message2() {
//        orderServiceImpl3.message();
        return "message2";
    }

    @RequestMapping("/order/message3")
    @SentinelResource("message3")
    public String message3(String name,Integer age) {
        return "message3"+name+age;
    }

    @RequestMapping("/order/message")
    public String message() {
        return orderServiceImpl3.message();
    }
}
