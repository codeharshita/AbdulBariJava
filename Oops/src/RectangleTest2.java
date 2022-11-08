class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public int peri() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else {
            return false;
        }
    }
}


public class RectangleTest2 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setBreadth(2);
        r.setLength(10);

        System.out.println(r.isSquare());
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        System.out.println(r.area() + " is the area. ");
        System.out.println(r.peri() + " is the perimeter.");
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        
    }
}
