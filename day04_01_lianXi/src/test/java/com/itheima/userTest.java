package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.uilts.BaseUilt;
import org.junit.Test;
import com.itheima.dao.userDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class userTest{
    @Autowired
    private UserService userService;

    @Test
    public void testUserService(){
        userService.exchangeNames(10003,10004);
    }
}
