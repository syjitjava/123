package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.domain.dept;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface userDao {
/*    @Select("SELECT * FROM USER WHERE gender=#{gender} and age > #{age}")
   List<User> findByNameAndAge(@Param("gender")String gender ,@Param("age") Integer age);

    List<User> findByUser(User user);
@Results(
        id = "userMap",
        value = {
                @Result(column = "uid" ,property = "uid"),
                @Result(column = "user_name" ,property = "user_name"),
                @Result(column = "gender" ,property = "gender"),
                @Result(column = "email" ,property = "email"),
                @Result(column = "birthday" ,property = "birthday"),
                @Result(column = "did" ,property = "did"),
                @Result(column = "did" ,property = "dept",many = @Many(select = "findByDid",fetchType = FetchType.LAZY))
        }
)
    @Select("select * from user")
    List<User> findAllWithDept();*/


   User findByUid(Integer Uid);

    void updateByUid(User user);

}
