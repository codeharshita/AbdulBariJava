public class DataHiding {

    private int l;
    private int b;

    public boolean setLength(int length) {
        l = length;
        return false;
    }

    public void setBreadth(int breadth) {
        b = breadth;
    }

    public int getLength() {
        return l;
    }

    public int getBreadth() {
        return b;
    }

    public int area() {
        return l * b;
    }

    public int peri() {
        return 2 * (l + b);
    }

    public static void main(String[] args) {
        DataHiding rect = new DataHiding();
        //System.out.println(rect.setLength(10));
        //System.out.println(rect.setBreadth(15));
    }
}
