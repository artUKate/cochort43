package abstraction.task1;

abstract class InputDevice {
    public abstract void connect();
    public abstract void disconnect();


    public void commonMethod() {
        System.out.println("This is a common method for input devices");
    }

}
