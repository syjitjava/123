package com.tiheima.dao;

import com.tiheima.domain.User;

import java.util.List;

public interface userDao {
     void save(User user);
     void update(User user);
     List<User> findByName(User user);
    List<User> findByName1(User user);
    List<User> findByUids(User user);
}
