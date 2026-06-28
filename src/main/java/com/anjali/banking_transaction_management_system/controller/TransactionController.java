package com.anjali.banking_transaction_management_system.controller;

import com.anjali.banking_transaction_management_system.entity.Transaction;
import com.anjali.banking_transaction_management_system.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import com.anjali.banking_transaction_management_system.dto.TransferRequestDto;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/deposit/{accountId}")
    public Transaction deposit(@PathVariable Long accountId, @RequestParam BigDecimal amount) {
        return transactionService.deposit(accountId, amount);
    }

    @PostMapping("/withdraw/{accountId}")
    public Transaction withdraw(@PathVariable Long accountId, @RequestParam BigDecimal amount) {
        return transactionService.withdraw(accountId, amount);
    }

    @GetMapping("/account/{accountId}")
    public List<Transaction> getTransactionsByAccountId(@PathVariable Long accountId) {
        return transactionService.getTransactionsByAccountId(accountId);
    }

    @PostMapping("/transfer")
    public String transfer(@RequestBody TransferRequestDto requestDto) {
        return transactionService.transfer(requestDto);
    }
}
