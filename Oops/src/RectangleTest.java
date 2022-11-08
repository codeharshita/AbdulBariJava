public class RectangleTest {

    private int length;
    private int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        RectangleTest r = new RectangleTest();
        r.length = 19;
        r.breadth = 10;

        System.out.println(r.area() + " is the area. ");
        System.out.println(r.perimeter() + " is the perimeter.");
        System.out.println(r.isSquare());
    }
}
