package com.bank.hub.account;

import java.time.LocalDateTime;
import java.util.List;

import com.bank.hub.account.dto.SpecificAccount;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bank.hub.account.dto.AccountGetResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {
  private final AccountService accountService;

  @GetMapping("/accounts") // TODO: headers -> customer_id
  public ResponseEntity<List<AccountGetResponse>> getAccount(@RequestParam long customerId) {
    return  ResponseEntity.ok(accountService.getAccount(customerId));
    //return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccount(customerId));
  }

  @GetMapping("/account/{accountNumber}/detail")
  public  ResponseEntity<SpecificAccount> getAccountDetail(@PathVariable String accountNumber,
                                                           @RequestParam long customerId,
                                                           @RequestParam LocalDateTime viewYearMonth) {
    // TODO: customerId 검증
    return  ResponseEntity.ok(accountService.getAccountDetail(accountNumber,viewYearMonth));
  }
}
