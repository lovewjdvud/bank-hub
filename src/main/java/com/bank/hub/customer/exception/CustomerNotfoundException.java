package com.bank.hub.customer.exception;

public class CustomerNotfoundException extends CustomerException {
  public CustomerNotfoundException(long id, String name) {
    super(id, name);
  }
}
