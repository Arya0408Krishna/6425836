public class Logger {
    // Private static instance of the Logger class
    private static volatile Logger instance = null;
    
    // Private constructor to prevent instantiation
    private Logger() {
        // Prevent instantiation via reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }
    
    // Public static method to get the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    // Example method to demonstrate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}