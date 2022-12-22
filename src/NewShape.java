abstract class Shape {
    abstract public void perimeter();

    abstract public void area();
}

class Circle extends Shape {
    float radius = 3.2f;

    public void perimeter() {
        System.out.println(2 * Math.PI * radius);
    }

    public void area() {
        System.out.println(Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    int l = 5;
    int b = 2;

    public void perimeter() {
        System.out.println(2 * (l + b));
    }

    public void area() {
        System.out.println(l * b);

    }
}

public class NewShape {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area();
        c1.perimeter();
        Rectangle r1 = new Rectangle();
        r1.area();
        r1.perimeter();

    }
}

