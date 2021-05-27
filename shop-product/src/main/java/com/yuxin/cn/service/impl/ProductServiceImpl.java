package com.yuxin.cn.service.impl;

import com.yuxin.cn.dao.ProductDao;
import com.yuxin.cn.domain.Product;
import com.yuxin.cn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product findByPid(Integer pid) {
        return productDao.findById(pid).get();
    }
}
