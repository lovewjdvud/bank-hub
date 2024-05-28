package com.bank.hub.transaction.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class TransferPostResponse {
    private String resultCode;
    private String resultMessage;
}
