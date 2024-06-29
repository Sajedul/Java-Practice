public class CreditCardProcessor extends PaymentProcessor {

    public CreditCardProcessor(String merchantId) {
        super(merchantId);
    }

    @Override
    protected void authenticate() {
        System.out.println("Authenticating credit card transaction...");
    }

    @Override
    protected void initiateTransaction(double amount) {
        System.out.println("Initiating credit card transaction of $" + amount);
    }

    @Override
    protected boolean verifyTransaction() {
        System.out.println("Verifying credit card transaction...");
        return true; // Simulating successful verification
    }

    @Override
    protected void completeTransaction() {
        System.out.println("Completing credit card transaction...");
    }

    @Override
    protected void handleFailedTransaction() {
        System.out.println("Handling failed credit card transaction...");
    }
}
