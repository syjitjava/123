package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface userDao {
    //查询所有用户
    @Results(
            id = "UserMap",
            value = {
                    @Result(column="birthday" ,property="birthday"),
                    @Result(column="email" ,property="email"),
                    @Result(column="password", property="password"),
                    @Result(column="name", property="name"),
                    @Result(column="uid", property="uid"),
                    @Result(column = "uid" ,property = "accounts" ,
                            many = @Many(select = "com.itheima.dao.AccountDao.findByUid",fetchType = FetchType.LAZY))
            }
    )
    @Select("SELECT  * from user")
    List<User> findAllWithAccount();
    //根据uID查询账户信息
    @Select(" SELECT  * from user WHERE uid= #{uid}")
    List<User> findByUid(Integer uid);

    @Results(
            id = "resultMap",
            value = {
                    @Result(column="birthday" ,property="birthday"),
                    @Result(column="email" ,property="email"),
                    @Result(column="password", property="password"),
                    @Result(column="name", property="name"),
                    @Result(column="uid", property="uid"),
                    @Result(column = "uid" ,property = "roles" ,
                            many = @Many(select = "findByWithUid",fetchType = FetchType.LAZY))
            }
    )
@Select("SELECT * from user")
    List<User> findAllRole();
    @Select("SELECT * from user_role ur LEFT JOIN role r on ur.rid=r.rid WHERE ur.uid=#{uid}")
    List<Role> findByWithUid();
}


