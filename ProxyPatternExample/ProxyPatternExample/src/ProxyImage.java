public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    private static Map<String, RealImage> imageCache = new HashMap<>();

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Check cache first
        if (imageCache.containsKey(fileName)) {
            realImage = imageCache.get(fileName);
            System.out.println("Retrieved image " + fileName + " from cache.");
        } else {
            // Lazy initialization
            if (realImage == null) {
                realImage = new RealImage(fileName);
                imageCache.put(fileName, realImage);
            }
        }
        realImage.display();
    }
}