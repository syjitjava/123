package com.itheima;

import com.itheima.dao.AccountDao;
import com.itheima.dao.RoleDao;
import com.itheima.domain.Account;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import com.itheima.uilts.BaseUilt;
import com.itheima.dao.userDao;

import java.util.List;

public class Test extends BaseUilt{
    @org.junit.Test
    public void testFindAllWithUser(){
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> list =accountDao.findAllWithUser();
        for (Account account : list) {
            System.out.println(account+" "+account.getUser());
            System.out.println("=====================================");
        }
    }
    @org.junit.Test
    public void testFindAllWithAccount() {
       userDao userDao = sqlSession.getMapper(userDao.class);
        List<User> userList = userDao.findAllWithAccount();
        for (User user : userList) {
            System.out.println(user);
            for (Account account : user.getAccounts()) {
                System.out.println(account);
            }
            System.out.println("====================================");
        }
    }
    @org.junit.Test
    public void testFindAllWithRole() {
        RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
        List<User> allRole = roleDao.findAllRole();
        for (User user : allRole) {
            System.out.println(user);
            for (Role role : user.getRoles()) {
                System.out.println(role);
                System.out.println("=============================");
            }
        }
    }
    }
