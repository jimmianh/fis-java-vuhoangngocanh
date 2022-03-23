package com.company;

import java.util.Date;
import java.util.Objects;

public class Transaction {
    private long transactionId;
    private Date transactionDate;
    private Number fromAccount;
    private Number toAccount;
    private double amount;
    private int status;
    private String content;
    private String errorReason;

    public Transaction(long transactionId, Date transactionDate, Number fromAccount, Number toAccount, double amount, int status, String content, String errorReason) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
        this.content = content;
        this.errorReason = errorReason;
    }

    public Transaction() {
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Number getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Number fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Number getToAccount() {
        return toAccount;
    }

    public void setToAccount(Number toAccount) {
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return transactionId == that.transactionId && Double.compare(that.amount, amount) == 0 && status == that.status && Objects.equals(transactionDate, that.transactionDate) && Objects.equals(fromAccount, that.fromAccount) && Objects.equals(toAccount, that.toAccount) && Objects.equals(content, that.content) && Objects.equals(errorReason, that.errorReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactionDate, fromAccount, toAccount, amount, status, content, errorReason);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", amount=" + amount +
                ", status=" + status +
                ", content='" + content + '\'' +
                ", errorReason='" + errorReason + '\'' +
                '}';
    }
}
