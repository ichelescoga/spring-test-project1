package com.javadevjournal.demoproject.com.javadevjournal.demoproject.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @Enumerated(value = EnumType.STRING)
    private TransactionType transactionType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    private BigDecimal amount;


    public Transaction() {
    }


    public Transaction(long id, Client client, TransactionType transactionType, Date transactionDate, BigDecimal amount) {
        this.id = id;
        this.client = client;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
