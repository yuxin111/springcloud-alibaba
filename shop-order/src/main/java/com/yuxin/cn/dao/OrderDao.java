package com.yuxin.cn.dao;

import com.yuxin.cn.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Integer> {
}
