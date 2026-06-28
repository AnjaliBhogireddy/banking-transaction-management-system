package com.anjali.banking_transaction_management_system.repository;

import com.anjali.banking_transaction_management_system.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}