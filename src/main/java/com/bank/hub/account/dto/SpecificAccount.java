package com.bank.hub.account.dto;

import com.bank.hub.transaction.Transaction;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@ToString
public class SpecificAccount {

    private String accountNumber;
    private String accountType;
    private String accountName;
    private long accountAmount;
    private List<Transaction> depositAndWithdrawalHistory;
}
