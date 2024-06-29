public abstract class PaymentProcessor {
    private String merchantId;

    public PaymentProcessor(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void authenticate();
    protected abstract void initiateTransaction(double amount);
    protected abstract boolean verifyTransaction();
    protected abstract void completeTransaction();
    protected abstract void handleFailedTransaction();

    // Template method pattern
    public void processPayment(double amount) {
        authenticate();
        initiateTransaction(amount);
        if (verifyTransaction()) {
            completeTransaction();
        } else {
            handleFailedTransaction();
        }
    }
}
