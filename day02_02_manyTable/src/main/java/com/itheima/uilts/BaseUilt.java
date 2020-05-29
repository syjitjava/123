package com.itheima.uilts;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

public class BaseUilt {
    protected SqlSession sqlSession=null;
    @Before
    public void before(){
         sqlSession = MybatidUilt.openSession();
    }
    @After
    public void after(){
        sqlSession.commit();
        sqlSession.close();
    }
}
