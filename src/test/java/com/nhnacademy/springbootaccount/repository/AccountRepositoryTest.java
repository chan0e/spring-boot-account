package com.nhnacademy.springbootaccount.repository;

import com.nhnacademy.springbootaccount.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void testAccount(){
        Account at1 = new Account(1L,"944-955-45145",200000);

        accountRepository.save(at1);

        Optional<Account> actual = accountRepository.findById(1L);

        assertThat(actual).isPresent();
        assertThat(actual.get()).isEqualTo(at1);
    }

}