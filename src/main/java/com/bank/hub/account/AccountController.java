package com.bank.hub.account;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.hub.account.dto.AccountGetResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {
  private final AccountService accountService;

  @GetMapping("/accounts") // TODO: headers -> customer_id
  public List<AccountGetResponse> getAccount(@RequestParam long id) {

    return accountService.getAccount(id);
  }
}
