public class HomeAutomationTest {
    public static void main(String[] args) {
        // Create receiver
        Light livingRoomLight = new Light("Living Room");

        // Create commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Test 1: Turn light on
        System.out.println("Test 1: Turning light on");
        remote.setCommand(lightOn);
        remote.pressButton();

        // Test 2: Turn light off
        System.out.println("\nTest 2: Turning light off");
        remote.setCommand(lightOff);
        remote.pressButton();

        // Test 3: No command set
        System.out.println("\nTest 3: No command set");
        remote.setCommand(null);
        remote.pressButton();

        // Test 4: Control another light
        Light kitchenLight = new Light("Kitchen");
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        System.out.println("\nTest 4: Turning kitchen light on");
        remote.setCommand(kitchenLightOn);
        remote.pressButton();
    }
}