package com.nhnacademy.springbootaccount.repository;

import com.nhnacademy.springbootaccount.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
