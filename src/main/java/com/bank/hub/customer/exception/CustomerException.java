package com.bank.hub.customer.exception;

import com.bank.hub.common.exception.BaseException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
    private  final long id;
    private  final String name;
}
