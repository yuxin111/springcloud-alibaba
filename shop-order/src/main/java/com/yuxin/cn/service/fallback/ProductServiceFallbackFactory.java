//package com.yuxin.cn.service.fallback;
//
//import com.yuxin.cn.domain.Product;
//import com.yuxin.cn.service.ProductService;
//import feign.hystrix.FallbackFactory;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
////
//@Component
//@Slf4j
//public class ProductServiceFallbackFactory implements FallbackFactory<ProductService> {
//    @Override
//    public ProductService create(Throwable throwable) {
//        return new ProductService() {
//            @Override
//            public Product findByPid(Integer pid) {
//                log.error("{}",throwable);
//                Product product = new Product();
//                product.setPid(-100);
//                product.setPname("远程调用商品微服务出现异常了，进入容错逻辑");
//                return product;
//            }
//        };
//    }
//}
