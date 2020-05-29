package com.itheima.dao;

import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class userDaoImpl implements userDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User findByUid(Integer Uid) {
        return jdbcTemplate.queryForObject("select * from user where uid = ?",new BeanPropertyRowMapper<User>(User.class),Uid);
    }

    public void updateByUid(User user) {
jdbcTemplate.update("update user set did =? where uid =?",user.getDid(),user.getUid());
    }
}
