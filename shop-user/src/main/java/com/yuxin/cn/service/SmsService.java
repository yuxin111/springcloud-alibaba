package com.yuxin.cn.service;

import com.alibaba.fastjson.JSONObject;
import com.yuxin.cn.domain.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RocketMQMessageListener(
        consumerGroup = "shop-user",
        topic = "order-topic",
        consumeMode = ConsumeMode.CONCURRENTLY, // 消费模式,CONCURRENTLY,ORDERLY
        messageModel = MessageModel.BROADCASTING// 消息模式,BROADCASTING,CLUSTERING
)
public class SmsService implements RocketMQListener<Order> {
    @Override
    public void onMessage(Order order) {
        log.info("收到一个订单信息{},接下来发送短信", JSONObject.toJSONString(order));
    }
}
