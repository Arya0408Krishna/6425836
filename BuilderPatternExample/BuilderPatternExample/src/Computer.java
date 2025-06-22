public class Computer {
    // Required attributes
    private final String cpu;
    private final String ram;
    private final String storage;

    // Optional attributes
    private final String gpu;
    private final boolean hasWifi;
    private final boolean hasBluetooth;

    // Private constructor to be used by Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Getters for attributes
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public boolean hasWifi() {
        return hasWifi;
    }

    public boolean hasBluetooth() {
        return hasBluetooth;
    }

    // toString method for readable output
    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage +
               ", GPU=" + gpu + ", WiFi=" + hasWifi + ", Bluetooth=" + hasBluetooth + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Required attributes
        private final String cpu;
        private final String ram;
        private final String storage;

        // Optional attributes with default values
        private String gpu = null;
        private boolean hasWifi = false;
        private boolean hasBluetooth = false;

        // Constructor for required attributes
        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        // Setter methods for optional attributes
        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Build method to create Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}