package com.javadevjournal.demoproject.com.javadevjournal.demoproject.dto;

public class DebitTransactionDto {

    private long clientId;
    private boolean transactionType;
    private double amount;

    public DebitTransactionDto() {
    }

    public DebitTransactionDto(long clientId, boolean transactionType, double amount) {
        this.clientId = clientId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public boolean isTransactionType() {
        return transactionType;
    }

    public void setTransactionType(boolean transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
