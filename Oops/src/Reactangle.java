public class Reactangle {
    int length;
    int breadth;

    Reactangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }

    public int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Reactangle r1 = new Reactangle(24, 3);
        r1.display();
        System.out.println(r1.area() + " is the area of rectangle.");
    }
}
