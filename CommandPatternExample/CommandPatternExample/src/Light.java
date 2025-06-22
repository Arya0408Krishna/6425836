public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " light is turned ON");
    }

    public void turnOff() {
        System.out.println(name + " light is turned OFF");
    }
}