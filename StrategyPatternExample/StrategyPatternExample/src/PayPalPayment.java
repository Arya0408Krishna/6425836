public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal account " + email);
        return true; // Simulate successful payment
    }
}