package com.itheima.service.impl;

import com.itheima.dao.userDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.uilts.BaseUilt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseUilt implements UserService {
    @Autowired
private userDao userDao;

    public void exchangeNames(Integer uidOne, Integer uidTwo) {
        User one = userDao.findByUid(uidOne);
        User two = userDao.findByUid(uidTwo);
        one.setDid(two.getDid());
        two.setDid(one.getDid());
        userDao.updateByUid(one);
        userDao.updateByUid(two);
    }

}
