//Class implementation.
public class Bicycle {
    static int wheels = 2;

    public static void stop() {
        System.out.println("Bicycle stops.");
    }

    public static void main(String[] args) {
        System.out.println("Bicycle has " + wheels + " wheels.");
        stop();
    }
}
