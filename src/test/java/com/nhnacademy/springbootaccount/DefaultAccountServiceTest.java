package com.nhnacademy.springbootaccount;

import com.nhnacademy.springbootaccount.domain.Account;
import com.nhnacademy.springbootaccount.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class DefaultAccountServiceTest {
    
    @Autowired
    AccountService accountService;
    
    @Test
    void testGetAccounts(){
        List<Account> actual = accountService.getAccounts();
        System.out.println(actual);
        assertThat(actual.size()).isEqualTo(2);
    }

}