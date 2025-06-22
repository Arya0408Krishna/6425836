public class CustomerManagementTest {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Test 1: Find customer by ID
        System.out.println("Test 1: Finding customer with ID 1001");
        String customerDetails = service.getCustomerDetails("1001");
        System.out.println(customerDetails);

        // Test 2: Find another customer
        System.out.println("\nTest 2: Finding customer with ID 1002");
        customerDetails = service.getCustomerDetails("1002");
        System.out.println(customerDetails);
    }
}