public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Loading image " + fileName + " from remote server...");
        // Simulate time-consuming operation (e.g., network request)
        try {
            Thread.sleep(2000); // Simulate 2-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}