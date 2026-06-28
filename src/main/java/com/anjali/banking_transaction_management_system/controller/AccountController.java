package com.anjali.banking_transaction_management_system.controller;

import com.anjali.banking_transaction_management_system.entity.Account;
import com.anjali.banking_transaction_management_system.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/customer/{customerId}")
    public Account createAccount(@PathVariable Long customerId, @RequestBody Account account) {
        return accountService.createAccount(customerId, account);
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }
}