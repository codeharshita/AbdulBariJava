public class Lamp {
    
    boolean isOn;

    void turnON() {
        isOn = true;
        System.out.println("Lamp is on? " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Lamp is off? " + isOn);
    }

    public static void main(String[] args) {
        //Creating the object to access the methods without using static

        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnON();
        halogen.turnOff();
    }
}
