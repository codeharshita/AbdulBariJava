import org.w3c.dom.css.Rect;

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

    static class Rectangle {
        int length = 32;
        int breadth = 11;

        public int area() {
            return length * breadth;
        }

        public int peri() {
            return 2 * (length + breadth);
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        System.out.println(r.area() + " Area of rectangle.");
        System.out.println(r.peri() + " Perimeter of rectangle.");
        System.out.println();
        System.out.println("Area of the circle is " + c.area());
        System.out.println("Perimeter of the circle is " + c.perimeter());
        System.exit(0);
    }
}
