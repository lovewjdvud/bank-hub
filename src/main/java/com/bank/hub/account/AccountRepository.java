package com.bank.hub.account;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

  List<Account> findAccountByCustomerId(long customerId);
}
