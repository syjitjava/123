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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test extends BaseUilt {
    @org.junit.Test
    public void testSave() throws IOException {
        User user = new User();
        user.setName("传智播客7799");
        user.setPassword("123455");
        user.setEmail("qqqqqq");
        user.setBirthday(new Date());
        userDao userDao = sqlSession.getMapper(userDao.class);
        userDao.save(user);
        System.out.println(user);
    }

    @org.junit.Test
    public void testUpdate() {
        User user = new User();
        user.setUid(6);
        user.setName("传智播客9992");
        user.setPassword("88888888");
        user.setEmail("qqqqqq");
        user.setBirthday(new Date());
        userDao userDao = sqlSession.getMapper(userDao.class);
        userDao.update(user);
        System.out.println(user);
    }
    @org.junit.Test
    public void testfindByName(){
        userDao userDao = sqlSession.getMapper(userDao.class);
        User user = new User();user.setEmail("qqqqqq");
        List<User> list = userDao.findByName1(user);
        for (User u : list) {
            System.out.println(u);
        }
    }
    @org.junit.Test
    public void testfindByUids(){
        //集合形式
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(6);
        list.add(4);
       //数组形式
        //Integer[] array = {1, 4, 7, 5};

        //user实体类型式
        User user = new User();
        user.setUids(list);
        userDao userDao = sqlSession.getMapper(userDao.class);
        List<User> uids = userDao.findByUids(user);
        for (User uid : uids) {
            System.out.println(uid);
        }
    }
}