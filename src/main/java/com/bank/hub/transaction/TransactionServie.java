package com.bank.hub.transaction;

import com.bank.hub.account.Account;
import com.bank.hub.account.AccountRepository;
import com.bank.hub.transaction.dto.TransferPostRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransactionServie {

    private final TransactionRepository transactionRepository;
    private  final AccountRepository accountRepository;

    // 계좌 이체 트랜잭션 관리
    @Transactional
    public void transfer(TransferPostRequest request) {

        // 출금 내역 기록
        Account withdrawAccount = accountRepository.findAccountByNumber(request.getRequestAccountNumber())
                .orElseThrow();

        long amount = withdrawAccount.getBalance();

        Transaction withdraw = Transaction.builder()
                .balance(request.getRequestAmount())
                .type("출금")
                .balanceAfterTransaction(amount - request.getRequestAmount())
                .accountNumber(request.getRequestAccountNumber())
                .build();

        transactionRepository.save(withdraw);

        // 입금 내역 기록
        Account despositAccount = accountRepository.findAccountByNumber(request.getRequestAccountNumber())
                .orElseThrow();

         amount = withdrawAccount.getBalance();

        Transaction desposit = Transaction.builder()
                .balance(request.getTargetAmount())
                .type("출금")
                .balanceAfterTransaction(amount - request.getTargetAmount())
                .accountNumber(request.getTargetAccountNumber())
                .build();

        transactionRepository.save(desposit);
    }
}
