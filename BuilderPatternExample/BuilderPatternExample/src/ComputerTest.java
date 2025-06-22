public class ComputerTest {
    public static void main(String[] args) {
        // Basic computer with only required attributes
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        // Gaming computer with GPU and WiFi
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", "16GB", "1TB SSD")
                .setGpu("NVIDIA RTX 3080")
                .setWifi(true)
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Workstation with all optional attributes
        Computer workstation = new Computer.Builder("Intel Xeon", "32GB", "2TB HDD")
                .setGpu("NVIDIA Quadro")
                .setWifi(true)
                .setBluetooth(true)
                .build();
        System.out.println("Workstation: " + workstation);
    }
}