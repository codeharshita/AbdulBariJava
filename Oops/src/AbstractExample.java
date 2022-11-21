//Abstract class
abstract class Shape1 {
    abstract double perimeter();

    abstract double area();
}

//concrete class
class Circle1 extends Shape1 {
    double radius = 3.2;

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 extends Shape1 {
    double length = 4.3;
    double breadth = 2.1;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

}

public class AbstractExample {
    public static void main(String[] args) {

        Circle1 c1 = new Circle1();
        System.out.println("Area of circle is " + c1.area());
        System.out.println("Perimeter of circle is " + c1.perimeter());

        System.out.println();

        Rectangle1 r1 = new Rectangle1();
        System.out.println("Area of rectangle is " + r1.area());
        System.out.println("Perimeter of rectangle is " + r1.perimeter());

        //Dynamic Method Dispatch
        Shape1 s = new Circle1();
        System.out.println(s.area());
        System.out.println(s.perimeter());

        System.out.println();
        Shape1 s2 = new Rectangle1();
        System.out.println(s2.perimeter());
        System.out.println(s2.area());


    }
}
