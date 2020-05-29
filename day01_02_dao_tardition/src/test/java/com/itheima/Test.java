package com.itheima;

import com.tiheima.domain.User;
import com.tiheima.uilts.BaseUilt;
import com.tiheima.uilts.MybatidUilt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.tiheima.dao.userDao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Test extends BaseUilt {
    @org.junit.Test
    public void testSave() throws IOException {
        User user = new User();
        user.setName("传智播客77");
        user.setPassword("123455");
        user.setEmail("qqqqqq");
        user.setBirthday(new Date());
        userDao userDao = sqlSession.getMapper(userDao.class);
        userDao.save(user);
    }

    @org.junit.Test
    public void testUpdate() {
        User user = new User();
        user.setUid(2);
        user.setName("传智播客999");
        user.setPassword("88888888");
        user.setEmail("qqqqqq");
        user.setBirthday(new Date());
        userDao userDao = sqlSession.getMapper(userDao.class);
        userDao.update(user);
    }

    @org.junit.Test
    public void testDelete() {
        userDao userDao = sqlSession.getMapper(userDao.class);
        userDao.deleteByUid(2);
    }

    @org.junit.Test
    public void testfindAll() {
        userDao userDao = sqlSession.getMapper(userDao.class);
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void testfindAllMap() {
        userDao userDao = sqlSession.getMapper(userDao.class);
        List<User> users = userDao.findAllMap();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void testfindAllNameAndemail() {
        userDao userDao = sqlSession.getMapper(userDao.class);
        List<User> users = userDao.findAllNameAnd("传智播客77", "qqqqqq");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void testfindAllNameAnd2() {
        User parasms = new User();
        parasms.setName("传智播客77");
        parasms.setEmail("qqqqqq");
        userDao userDao = sqlSession.getMapper(userDao.class);
        List<User> users = userDao.findAllNameAnd2(parasms);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void testfindByName() {
        userDao userDao = sqlSession.getMapper(userDao.class);
        List<User> users = userDao.findByName("传");
        for (User user : users) {
            System.out.println(user);
        }
    }
}