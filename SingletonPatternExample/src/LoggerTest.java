public class LoggerTest {
    public static void main(String[] args) {
        // Test in multiple threads
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            System.out.println("Logger instance in thread " + Thread.currentThread().getName() + ": " + logger);
            logger.log("Message from " + Thread.currentThread().getName());
        };
        
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();
    }
}