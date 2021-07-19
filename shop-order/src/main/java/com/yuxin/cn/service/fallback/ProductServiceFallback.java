//package com.yuxin.cn.service.fallback;
//
//import com.yuxin.cn.domain.Product;
//import com.yuxin.cn.service.ProductService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//// 这是一个容错类，需要实现Feign所在的接口，并去实现接口中的所有方法
//// 一旦Feign远程调用出问题，就会进入当前类中同名方法，执行容错逻辑
//@Slf4j
//public class ProductServiceFallback implements ProductService {
//    @Override
//    public Product findByPid(Integer pid) {
//        Product product = new Product();
//        product.setPid(-100);
//        product.setPname("远程调用商品微服务出现异常了，进入容错逻辑");
//        return product;
//    }
//}
