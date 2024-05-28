package com.bank.hub.transaction.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TransferPostRequest {
    private String requestAccountNumber;
//    private String requestType;
    private int requestAmount;
    private String accountToken;
    private String targetAccountNumber;
    private int targetAmount;

}
