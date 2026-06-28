package com.anjali.banking_transaction_management_system.service;

import com.anjali.banking_transaction_management_system.entity.Account;
import com.anjali.banking_transaction_management_system.entity.Customer;
import com.anjali.banking_transaction_management_system.repository.AccountRepository;
import com.anjali.banking_transaction_management_system.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;

    public AccountService(AccountRepository accountRepository,
                          CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    public Account createAccount(Long customerId, Account account) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + customerId));

        account.setCustomer(customer);
        account.setStatus("ACTIVE");
        account.setBalance(account.getBalance() == null ? BigDecimal.ZERO : account.getBalance());
        account.setCreatedDate(LocalDateTime.now());

        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found with id: " + id));
    }
}