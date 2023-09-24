// Class representing a Bank Account (Encapsulation and Abstraction)
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; // Initialize balance to zero
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs" + balance);
    }
}

public class oop {
    public static void main(String[] args) {
        // Create an instance of the BankAccount class
        BankAccount account = new BankAccount("123456789", "Ramesh");

        // Deposit and withdraw money (Encapsulation)
        account.deposit(1000.0);
        account.withdraw(500.0);

        // Check balance (Abstraction)
        account.checkBalance();
    }
}
