package com.yuxin.cn.service.impl;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
public class OrderServiceImpl3BlockHanlder {
    /**
     * 1.当前方法的返回值和参数要和原方法一致
     * 2.允许在参数列表的最后加入一个参数BlockException，用来接收原方法中发生的异常
     * 这里必须是static
     * @return
     */
    public static String blockHandler(BlockException e){
        log.error("触发了BlockException,内容为{}",e);
        return "BlockException";
    }
}
