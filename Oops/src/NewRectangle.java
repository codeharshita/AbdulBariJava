public class NewRectangle {
    //Global/instance variables.
    int length;
    int breadth;

    //Non-parameterized constructors.
    public NewRectangle() {
        length = 10;
        breadth = 5;
    }

    //method
    public int area() {
        return length * breadth;
    }

    //parameterized-constructor
    public NewRectangle(int l, int b) {
        length = l;
        breadth = b;

    }

    //method overloading.
    public int area(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        NewRectangle r = new NewRectangle();
        System.out.println("The area of the rectangle is " + r.area());
        System.out.println(r.length);
        System.out.println(r.breadth);

        NewRectangle n = new NewRectangle(10, 8);
        System.out.println(n.area(10, 8) + " is the area.");
        System.out.println(n.length);
        System.out.println(n.breadth);
    }
}
