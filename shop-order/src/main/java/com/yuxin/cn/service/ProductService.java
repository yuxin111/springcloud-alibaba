package com.yuxin.cn.service;

import com.yuxin.cn.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-product")
public interface ProductService {

    @RequestMapping("/product/{pid}")
    Product findByPid(@PathVariable Integer pid);
}
