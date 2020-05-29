package com.itheima.uilts;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatidUilt {
    public static SqlSessionFactory factory=null;
    static {
        try {
            InputStream stream = Resources.getResourceAsStream("SqlMapcofig.xml");
             factory = new SqlSessionFactoryBuilder().build(stream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SqlSession openSession(){
        SqlSession sqlSession = factory.openSession();
        return sqlSession;
    }
}
