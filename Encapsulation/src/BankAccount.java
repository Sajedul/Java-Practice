public class BankAccount {
    // Private variables
    private double balance;
    // Constructor to set initial balance
    public BankAccount(double balance) {
        this.balance = balance;
    }
    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    // Public method to check balance
    public double getBalance() {
        return balance;
    }
}
