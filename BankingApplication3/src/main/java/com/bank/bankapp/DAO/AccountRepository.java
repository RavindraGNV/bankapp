package com.bank.bankapp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}