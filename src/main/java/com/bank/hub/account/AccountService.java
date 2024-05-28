package com.bank.hub.account;

import java.time.LocalDateTime;
import java.util.List;

import com.bank.hub.account.dto.SpecificAccount;
import com.bank.hub.transaction.Transaction;
import com.bank.hub.transaction.TransactionRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.bank.hub.account.dto.AccountGetResponse;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;
  private  final TransactionRepository transactionRepository;

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

  public SpecificAccount getAccountDetail(String accountNumber, LocalDateTime viewYearMonth){ // vym = 2023.05
    Account account = accountRepository.findAccountByNumber(accountNumber).orElseThrow();

    LocalDateTime startDate = viewYearMonth.plusDays(1); // 2023.05.01
    LocalDateTime endDate = viewYearMonth.plusMonths(1).minusDays(1); // 2023.06.31
    List<Transaction> transactionsList = transactionRepository.findByAccountNumberAndCreatedAtBetween(accountNumber,startDate,endDate);
    return SpecificAccount.builder()
            .accountNumber(account.getNumber())
            .accountAmount(account.getBalance())
            .depositAndWithdrawalHistory(transactionsList)
            .build();


  }

}
