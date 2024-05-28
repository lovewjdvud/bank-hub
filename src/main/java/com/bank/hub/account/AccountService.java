package com.bank.hub.account;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.bank.hub.account.dto.AccountGetResponse;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;

  public List<AccountGetResponse> getAccount(long customerId) {

    return accountRepository.findAccountByCustomerId(customerId).stream()
        .map(
            account ->
                AccountGetResponse.builder()
                    .number(account.getNumber())
                    .balance(account.getBalance())
                    .branchId(account.getBranchId())
                    .customerId(account.getCustomerId())
                    .build())
        .toList();
  }
}
