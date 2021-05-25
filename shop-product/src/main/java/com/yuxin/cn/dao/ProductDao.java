package com.yuxin.cn.dao;

import com.yuxin.cn.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
