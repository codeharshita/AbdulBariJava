public class Car {
    //Global variable declaration
    int wheels;
    String modelNumber;

    static int mirrors;
    static String name;

    public static void main(String[] args) {

        //hyundai is object reference variable.
        // new car() -> is your object which is placed inside of your heap java memory
        Car hyundai = new Car();
        hyundai.wheels = 4;
        hyundai.modelNumber = "x45562L";

        int mirrors = 3;
        String name = "okkdw";
        System.out.println(mirrors);
        System.out.println(name);

        System.out.println(hyundai.wheels);
        System.out.println(hyundai.modelNumber);
    }
}
