package cn.itbro.service.impl;

import cn.itbro.domain.Account;
import cn.itbro.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户信息。。。");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户。。。");
    }
}
