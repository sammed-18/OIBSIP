import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction(amount, "Deposit"));
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction(-amount, "Withdraw"));
            return true;
        }
        return false; // Insufficient funds
    }

    public void displayTransactionHistory() {
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction.getDescription() + ": $" + transaction.getAmount());
        }
    }
}
