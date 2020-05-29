package com.itheima.dao;


import com.itheima.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public  interface RoleDao {
    @Insert("insert into role values (null,#{roleName},#{description})")
     void save(Role role);


    @Delete("delete from role where rid = #{rid}")
     void deleteByRid(Integer rid);


    @Update("update role set roleName=#{roleName},description=#{description} where rid=#{rid}")
    void updateByRid(Role role);

    @ResultMap("resultMap")
    @Select("select  rid as id,roleName as name ,description from role")
    List<Role> findAllRole();

    @Results(
            id = "resultMap",
            value = {
                    @Result(column = "id", property = "rid", id = true),
                    @Result(column = "name", property = "roleName"),
                    @Result(column = "description", property = "description")
            }

    )


    @Select("select rid as id,roleName as name ,description from role where rid=#{rid}")
    Role findByRid(Integer rid);
}
