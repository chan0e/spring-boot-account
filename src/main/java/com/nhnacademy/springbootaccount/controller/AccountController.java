package com.nhnacademy.springbootaccount.controller;


import com.nhnacademy.springbootaccount.domain.Account;
import com.nhnacademy.springbootaccount.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }


    @GetMapping("/accounts/{id}")
    public Account getAccounts(@PathVariable Long id){
        return accountService.getaccount(id);
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @DeleteMapping("/accounts/{id}")
    public String deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
        return "{" +
                "\"result\"" +
                ":\"OK\"" +
                "}";
    }



}
