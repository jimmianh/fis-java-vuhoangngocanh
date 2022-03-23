package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Account {
    private long accountId;
    private String accountNumber;
    private String accountName;
    private double balance;
    private int status;

    public Account(long accountId, String accountNumber, String accountName, double balance, int status) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.status = status;
    }

    public Account() {
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountId == account.accountId && Double.compare(account.balance, balance) == 0 && status == account.status && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountName, account.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountNumber, accountName, balance, status);
    }
    ArrayList<Account> accountArrayList = new ArrayList<Account>();
    Scanner scanner = new Scanner(System.in);

    public void showList(){
        System.out.println("Danh Sach tai Khoan");
        System.out.printf("|%-10s | %-30s | %-30s | %-30s|%-30s|%n", "Stt", "Số tài khoản", "Tên tài khoản","Số dư","Trạng thái");
        for(int i = 0; i < accountArrayList.size(); i++) {
            System.out.printf("|%-10d | %-30d | %-30s | %-30s|%-30s %n",
                    (i+1)
                    ,accountArrayList.get(i).getAccountId()
                    , accountArrayList.get(i).getAccountName()
                    ,accountArrayList.get(i).getBalance()
                    ,accountArrayList.get(i).getStatus());
        }
    }

    public void addList(){
        Account account = new Account(); // Creating a new object

        System.out.println("Vui Long Nhap So Tai Khoan");
        account.setAccountId(scanner.nextLong());

        System.out.println("Vui Long Nhap ten Tai Khoan");
        scanner.nextLine();
        account.setAccountName(scanner.nextLine());


        accountArrayList.add(account); // Adding it to the list
        System.out.println("Thêm thành công");

    }

    public void removeById(){
        System.out.println("Vui long nhap so tai khoan muon xoa");
        scanner.nextLong();
        for (int j = 0; j < accountArrayList.size(); j++) {
            accountArrayList.remove(accountArrayList.get((int)scanner.nextLong()).getAccountId());
        }
        System.out.println("Xóa thành công ");
    }
}
