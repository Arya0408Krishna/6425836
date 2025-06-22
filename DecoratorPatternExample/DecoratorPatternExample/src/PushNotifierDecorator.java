public class PushNotifierDecorator extends NotifierDecorator {
    public PushNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
        sendPush(message);
    }

    private void sendPush(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}