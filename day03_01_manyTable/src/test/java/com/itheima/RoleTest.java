package com.itheima;

import com.itheima.domain.Role;
import com.itheima.uilts.BaseUilt;
import org.junit.Test;
import com.itheima.dao.RoleDao;

import java.util.List;

public class RoleTest extends BaseUilt {

    @Test
    public void testSave() {
        RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
        Role role = new Role();
        role.setRoleName("传智播客");
        role.setDescription("出库管理");
        roleDao.save(role);
    }

    @Test
    public void testDelete() {
        RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
        roleDao.deleteByRid(3);

    }

    @Test
    public void testUpdateByRid() {
        RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
        Role role = new Role();
        role.setRid(4);
        role.setRoleName("hahahaha");
        role.setDescription("哈哈哈哈");
        roleDao.updateByRid(role);
    }

    @Test
    public void testFindAllRole() {
        RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
        List<Role> list = roleDao.findAllRole();
        for (Role role : list) {
            System.out.println(role);
        }
    }

    @Test
    public void testFindByRid() {
        RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
        Role role = roleDao.findByRid(2);
        System.out.println(role);
    }
}