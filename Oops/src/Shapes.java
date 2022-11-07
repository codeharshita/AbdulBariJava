public class Shapes {
    static class Circle {
        double radius = 7.3;

        public double area() {
            return (int) (Math.PI * radius * radius);
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area of the circle is " + c.area());
        System.out.println("Perimeter of the circle is " + c.perimeter());
        System.exit(0);
    }
}
