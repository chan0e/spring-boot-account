package com.nhnacademy.springbootaccount.service;

import com.nhnacademy.springbootaccount.repository.AccountRepository;
import com.nhnacademy.springbootaccount.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class DefaultAccountService implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getaccount(Long id) {
        return accountRepository.findById(id).orElseThrow(() -> new RuntimeException("존재하지 않습니다."));
    }

    @Override
    public Account createAccount(Account account) {
        accountRepository.findById(account.getId()).ifPresent(
                s -> {throw new RuntimeException("이미 존재하는 계좌입니다.");
                });
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
            accountRepository.deleteById(id);
    }


}
