package com.javadevjournal.demoproject.com.javadevjournal.demoproject.service;

import com.javadevjournal.demoproject.com.javadevjournal.demoproject.model.Transaction;
import com.javadevjournal.demoproject.com.javadevjournal.demoproject.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    private TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
