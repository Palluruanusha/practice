 package com.practice.pack1;
import java.util.ArrayList;//used to manage all transactions
import java.util.Date;//used to store the transaction dates
import java.util.Random;//to generate random transactions Id's and account numbers

public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(0.5);
        CurrentAccount currentAccount = new CurrentAccount(25000);

        savingsAccount.deposit(100000);
        savingsAccount.calculateInterest();
        savingsAccount.printTransactions();

        currentAccount.withdraw(20000);
        currentAccount.printTransactions();
    }
}
//customer
class Customer {
    private String name;
    private String dateOfBirth;
    private String aadharNumber;
    private Account account;

    public Customer(String name, String dateOfBirth, String aadharNumber, Account account) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.aadharNumber = aadharNumber;
        this.account = account;
    }

}
//Account class
abstract class Account {
    protected int accountNumber;
    protected double balance;
    protected ArrayList<Transaction> transactionList;

    public Account() {
        Random rand = new Random();
        this.accountNumber = rand.nextInt(50000);
        this.balance = 0;
        this.transactionList = new ArrayList<>();
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void createTransaction(String type, double amount) {
        Transaction transaction = new Transaction(type, amount);
        transactionList.add(transaction);
        if (type.equals("debit")) {
            this.balance -= amount;
        } else if (type.equals("credit")) {
            this.balance += amount;
        }
    }

    public void printTransactions() {
        for (Transaction transaction : transactionList) {
            System.out.println(transaction);
        }
    }
}
//savings Account class
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        createTransaction("credit", amount);
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            createTransaction("debit", amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void calculateInterest() {
        double dailyInterest = (this.balance * this.interestRate) / 365;
        System.out.println("Daily interest: " + dailyInterest);
    }
}
// current account class
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        createTransaction("credit", amount);
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance + this.overdraftLimit >= amount) {
            createTransaction("debit", amount);
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }
}
//transaction class
class Transaction {
    private int transactionId;
    private Date date;
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        Random rand = new Random();
        this.transactionId = rand.nextInt(500000);
        this.date = new Date();
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Date: " + date + ", Amount: " + amount + ", Type: " + type;
    }
}