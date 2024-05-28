package com.bank.hub.transaction;

import com.bank.hub.transaction.dto.TransferPostRequest;
import com.bank.hub.transaction.dto.TransferPostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class TransactionController {

    private final  TransactionServie transactionServie;
    @PostMapping("/transfer")
    public ResponseEntity<TransferPostResponse> transfer(@RequestBody TransferPostRequest request) {
        // TODO: TransactionService 연결
        transactionServie.transfer(request);
        return ResponseEntity.ok(TransferPostResponse
                .builder()
                .resultMessage("정상처리")
                .resultCode("00")
                .build());
    }
}
