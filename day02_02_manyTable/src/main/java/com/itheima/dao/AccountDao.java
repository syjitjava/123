package com.itheima.dao;

import com.itheima.domain.Account;
import org.junit.Test;

import java.util.List;

public interface AccountDao {
    List<Account> findAllWithUser();
}
