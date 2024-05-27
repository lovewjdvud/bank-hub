package com.bank.hub.account;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Account {

    @Id
    private String number;

    private String type;

    private long balance;

    private String password;

    private int employeeId;

    private int branchId;

    private int customerId;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;
}
