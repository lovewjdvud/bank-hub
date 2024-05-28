package com.bank.hub.account;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.*;

import com.bank.hub.common.entity.BaseEntity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
public class Account extends BaseEntity {

  @Id private String number;

  private String type;

  private boolean isFirst;

  private long balance;

  private String password;

  private int employeeId;

  private int branchId;

  private long customerId;
}
