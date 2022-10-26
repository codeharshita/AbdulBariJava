public class OverloadingP1 {

    static int area(int l, int b) {
        return l * b;
    }

    static double area(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle is " + area(5, 2));
        System.out.println("Area of circle is " + area(4));
        System.exit(0);
    }
}
