package abstraction.task1;

public class DeviceApp {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();


        keyboard.connect();
        keyboard.disconnect();


        mouse.connect();
        mouse.disconnect();
    }
}