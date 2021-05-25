package com.yuxin.cn.dao;

import com.yuxin.cn.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
