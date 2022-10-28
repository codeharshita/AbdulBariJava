public class MethodParameters {

    public void display1() {
        System.out.println("Method with no parameters.");
    }

    public void display2(int n) {
        System.out.println("Method with only one parameter." + n);
    }

    public static void main(String[] args) {

        MethodParameters obj = new MethodParameters();
        obj.display1();
        obj.display2(34);

    }
}
