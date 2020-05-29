package com.itheima.dao;


import com.itheima.domain.dept;
import org.apache.ibatis.annotations.Select;

public interface deptDao {
    @Select("select * from dept where did = #{did}")
    dept findByDid(Integer did);
}
