package com.bank.hub.customer.exception;

import com.bank.hub.common.exception.BaseException;

public class CustomerNotfoundException extends CustomerException  {
    public CustomerNotfoundException(long id, String name) {
        super(id, name);
    }
}

