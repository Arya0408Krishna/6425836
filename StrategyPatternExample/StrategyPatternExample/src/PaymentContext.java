public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy set!");
            return false;
        }
        return paymentStrategy.pay(amount);
    }
}