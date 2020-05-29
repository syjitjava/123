package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.junit.Test;

import java.util.List;

public interface AccountDao {
    @Results(
            id = "accountMap",
            value = {
                    @Result(column="aid" ,property="aid"),
                    @Result(column="accountName", property="accountName"),
                    @Result(column="balance" ,property="balance"),
                    @Result(column ="uid",property = "user",
                            one =@One(select = "com.itheima.dao.userDao.findByUid",fetchType = FetchType.LAZY))
            }
    )
    @Select("select * from account")
    List<Account> findAllWithUser();

    @Select("select * from account where uid=#{uid}")
    List<Account> findByUid(Integer uid);
}
