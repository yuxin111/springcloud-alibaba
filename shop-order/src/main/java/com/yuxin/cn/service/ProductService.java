package com.yuxin.cn.service;

import com.yuxin.cn.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        value = "service-product"
        //fallbackFactory = ProductServiceFallbackFactory.class
)
public interface ProductService {

    @RequestMapping("/product/{pid}")
    Product findByPid(@PathVariable Integer pid);

    // 扣减库存
    @RequestMapping("/product/reduceInventory")
    void reduceInventory(@RequestParam("pid") Integer pid, @RequestParam("number") Integer number);
}
