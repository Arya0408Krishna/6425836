public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing payment of $" + amount + " via Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
        return true; // Simulate successful payment
    }
}