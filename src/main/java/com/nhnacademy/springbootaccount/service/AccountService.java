package com.nhnacademy.springbootaccount.service;

import com.nhnacademy.springbootaccount.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    Account getaccount(Long id);

    Account createAccount(Account account);

    void deleteAccount(Long id);
}
