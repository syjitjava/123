package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.User;

import java.util.List;

public interface userDao {
    List<User> findAllWithAccount();
}

