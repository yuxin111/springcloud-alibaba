package com.yuxin.cn.service;

import com.yuxin.cn.domain.Product;
import com.yuxin.cn.service.fallback.ProductServiceFallback;
import com.yuxin.cn.service.fallback.ProductServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(
        value = "service-product",
        fallbackFactory = ProductServiceFallbackFactory.class
)
public interface ProductService {

    @RequestMapping("/product/{pid}")
    Product findByPid(@PathVariable Integer pid);
}
