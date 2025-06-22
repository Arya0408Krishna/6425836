import java.util.HashMap;
import java.util.Map;

public class ImageViewerTest {
    public static void main(String[] args) {
        // Test 1: Load and display image1 (should load from server)
        Image image1 = new ProxyImage("image1.jpg");
        System.out.println("First display of image1:");
        image1.display();

        // Test 2: Display image1 again (should use cache)
        System.out.println("\nSecond display of image1:");
        image1.display();

        // Test 3: Load and display image2 (should load from server)
        Image image2 = new ProxyImage("image2.jpg");
        System.out.println("\nFirst display of image2:");
        image2.display();

        // Test 4: Display image1 again (should use cache)
        System.out.println("\nThird display of image1:");
        image1.display();
    }
}