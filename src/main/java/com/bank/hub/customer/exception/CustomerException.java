package com.bank.hub.customer.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import com.bank.hub.common.exception.BaseException;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
  private final long id;
  private final String name;
}
