public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public boolean processPayment(double amount) {
        // Convert double amount to String for PayPal
        String amountStr = String.valueOf(amount);
        return payPalGateway.makePayment(amountStr);
    }
}