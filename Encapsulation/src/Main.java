public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);
        account.deposit(500); // Adding money
        account.withdraw(200); // Withdrawing money

        System.out.println("Current Balance: " + account.getBalance());
    }
}