package com.bank.hub.transaction;

import com.bank.hub.common.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction  extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long balance;

    private  String type;

    private  long balanceAfterTransaction;

    private  String accountNumber;
}
