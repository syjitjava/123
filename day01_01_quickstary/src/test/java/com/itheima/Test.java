package com.itheima;

import com.tiheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Test {
    @org.junit.Test
    public void testSave() throws IOException {
        User user = new User();
        user.setName("传智播客");
        user.setPassword("123455");
        user.setEmail("qqqqqq");
        user.setBirthday(new Date());
        InputStream stream = Resources.getResourceAsStream("SqlMapcofig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = factory.openSession();
        sqlSession.insert("userMapper.save",user);
        sqlSession.commit();
        sqlSession.close();
    }

}
