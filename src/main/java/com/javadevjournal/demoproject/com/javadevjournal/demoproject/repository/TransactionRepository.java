package com.javadevjournal.demoproject.com.javadevjournal.demoproject.repository;

import com.javadevjournal.demoproject.com.javadevjournal.demoproject.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {




}
