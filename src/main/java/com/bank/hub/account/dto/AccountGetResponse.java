package com.bank.hub.account.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class AccountGetResponse {
  private String number;
  private String type;
  private boolean isFirst;
  private long balance;
  private String password;
  private int employeeId;
  private int branchId;
  private long customerId;
}
