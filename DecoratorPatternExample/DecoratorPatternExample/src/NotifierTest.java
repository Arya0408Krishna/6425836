public class NotifierTest {
    public static void main(String[] args) {
        // Test 1: Email only
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("Test 1: Email only");
        emailNotifier.send("Hello, this is a test notification!");

        // Test 2: Email + SMS
        Notifier emailWithSMS = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println("\nTest 2: Email + SMS");
        emailWithSMS.send("Hello, this is a test notification!");

        // Test 3: Email + SMS + Slack
        Notifier emailWithSMSAndSlack = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        System.out.println("\nTest 3: Email + SMS + Slack");
        emailWithSMSAndSlack.send("Hello, this is a test notification!");

        // Test 4: Email + SMS + Slack + Push
        Notifier fullNotifier = new PushNotifierDecorator(
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(new EmailNotifier())
                )
        );
        System.out.println("\nTest 4: Email + SMS + Slack + Push");
        fullNotifier.send("Hello, this is a test notification!");
    }
}