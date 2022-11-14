//Class implementation.
class RoboBike {
     String name = "HONDAKO";
    int wheel = 4;
}

public class Bicycle {
    static int wheels = 2;

    public static void stop() {
        System.out.println("Bicycle stops.");
    }

    public static void main(String[] args) {

        /* Here we can say that
        Bicycle class has a object of robobike class
        So it is a HAS-A relationship class.
        * */
        RoboBike trb = new RoboBike();
        System.out.println(trb.name);
        System.out.println(trb.wheel);

        System.out.println("Bicycle has " + wheels + " wheels.");
        stop();
    }
}
