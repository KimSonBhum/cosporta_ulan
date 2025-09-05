package com.ulan.cosporta_ulan.repository;

import com.ulan.cosporta_ulan.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
