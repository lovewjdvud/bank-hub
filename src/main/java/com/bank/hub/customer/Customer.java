package com.bank.hub.customer;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import com.bank.hub.common.entity.BaseEntity;

@Entity
public class Customer extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  private String grade;

  private int age;

  private String email;

  private String organization;

  private LocalDateTime updatedAt;
}
