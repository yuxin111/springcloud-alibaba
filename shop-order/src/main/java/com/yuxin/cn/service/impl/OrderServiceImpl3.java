package com.yuxin.cn.service.impl;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yuxin.cn.dao.OrderDao;
import com.yuxin.cn.domain.Order;
import com.yuxin.cn.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
@Slf4j
public class OrderServiceImpl3 {

    // 定义资源 指定资源名称
    @SentinelResource(
            value = "message",
            blockHandlerClass = OrderServiceImpl3BlockHanlder.class,
            blockHandler = "blockHandler",
            fallbackClass = OrderServiceImpl3Fallback.class,
            fallback = "fallback"
    )
    public String message() {
        return "message";
    }

    /**
     * 1.当前方法的返回值和参数要和原方法一致
     * 2.允许在参数列表的最后加入一个参数BlockException，用来接收原方法中发生的异常
     * @return
     */
//    public String blockHandler(BlockException e){
//        log.error("触发了BlockException,内容为{}",e);
//        return "BlockException";
//    }

    /**
     * 1.当前方法的返回值和参数要和原方法一致
     * 2.允许在参数列表的最后加入一个参数BlockException，用来接收原方法中发生的异常
     * @return
     */
//    public String fallback(Throwable e){
//        log.error("触发了Throwable,内容为{}",e);
//        return "Throwable";
//    }
}
