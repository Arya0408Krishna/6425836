public class PaymentSystemTest {
    public static void main(String[] args) {
        // Create payment context
        PaymentContext paymentContext = new PaymentContext(null);

        // Test 1: Credit Card payment
        PaymentStrategy creditCard = new CreditCardPayment("1234567890123456", "John Doe");
        paymentContext.setPaymentStrategy(creditCard);
        System.out.println("Test 1: Paying with Credit Card");
        paymentContext.executePayment(100.50);

        // Test 2: PayPal payment
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");
        paymentContext.setPaymentStrategy(payPal);
        System.out.println("\nTest 2: Paying with PayPal");
        paymentContext.executePayment(75.25);

        // Test 3: No strategy set
        paymentContext.setPaymentStrategy(null);
        System.out.println("\nTest 3: Attempting payment without strategy");
        paymentContext.executePayment(50.00);
    }
}