public class Outer {
    static int a = 10;

    public static void display() {
        System.out.println("Display on the screen." + a);
    }

    static class Inner {

        static int x = 8;

        public void run() {
            System.out.println("Pakya Bhag.");
        }

    }

    public static void main(String[] args) {
        System.out.println(Outer.a);
        Outer.display();

        Outer.Inner obj1 = new Outer.Inner();
        obj1.run();
        System.out.println(Inner.x);

    }
}
