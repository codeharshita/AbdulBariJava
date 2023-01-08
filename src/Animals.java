/**
 * @author hp
 * @version 2.0
 * @since 2022
 * <p>
 * Class of Tiger.
 */

class Tiger {
    /**
     * @value legs is 4
     */
    static int legs = 4;
    String name;

    /**
     * @value name
     */
    static int eyes = 2;
    static String color = "Yellowish Brown.";

    /**
     *
     */
    public static void run() {
        System.out.println("Tiger is running.");
    }

    public static void eat() {
        System.out.println("Tiger is eating.");
    }

    //This is now a method.
    public String Tiger() {
        return "I am a  tiger.";
    }
//
//   // public Tiger(String name){
//      //  this.name = name;
//    }
}

public class Animals {
    public static void main(String[] args) {
        //  Tiger t1 = new Tiger("Sher");
        Tiger t2 = new Tiger();
        // System.out.println(t1.name);
        t2.Tiger();
        Tiger.eat();
        Tiger.run();
        System.out.println(Tiger.color);
        System.out.println(Tiger.legs);
        System.out.println(Tiger.eyes);


    }
}
