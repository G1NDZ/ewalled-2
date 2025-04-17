package id.co.bsi.walled_2.controller;

import id.co.bsi.walled_2.dto.request.RegisterRequest;
import id.co.bsi.walled_2.dto.request.TransferRequest;
import id.co.bsi.walled_2.dto.response.RegisterResponse;
import id.co.bsi.walled_2.dto.response.TransferResponse;
import id.co.bsi.walled_2.model.Transactions;
import id.co.bsi.walled_2.repository.TransactionsRepository;
import id.co.bsi.walled_2.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsController {
    @Autowired
    private TransactionsService transactionsService;

    @PostMapping("/api/transfer")
    public ResponseEntity<TransferResponse> transfer(@RequestBody TransferRequest transferRequest) {
        TransferResponse transferResponse = new TransferResponse();
        try {
            Transactions transfer = this.transactionsService.transfer(transferRequest);
            transferResponse.setStatus("OK");
            transferResponse.setMessage("berhasil transfer");
        }
        catch (Exception e) {
            transferResponse.setStatus("FAILED");
            transferResponse.setMessage("GAGAL TRANSFER " + e.getMessage());
        }
        return ResponseEntity.ok(transferResponse);
    }
}
