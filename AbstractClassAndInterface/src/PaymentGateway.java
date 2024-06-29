public interface PaymentGateway {
    void connect();
    void disconnect();
    boolean processPayment(double amount);
}
