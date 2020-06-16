package cn.tx.service;

import cn.tx.dao.AccountDao;
import cn.tx.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: tx_ssm
 * @description: AccountService实现
 * @author: Sam
 * @create: 2020-06-07 15:36
 **/

@Service
public class AccountServiceImpl implements AccountService
{

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {

        System.out.println("业务层：查询所有账号");
        return accountDao.findAll();
    }
}
