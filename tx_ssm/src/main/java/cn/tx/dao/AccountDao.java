package cn.tx.dao;

import cn.tx.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: tx_ssm
 * @description: jikou
 * @author: Sam
 * @create: 2020-06-08 16:29
 **/

public interface AccountDao {

    @Select(value = "select * from account")
    public List<Account> findAll();

}
