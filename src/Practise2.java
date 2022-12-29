public class Practise2 {
    public static void main(String[] args) {


        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result is " + c);
        } catch (Exception e) {
            System.out.println("Can't divide by zero" + " " + e.getMessage());

        }
    }
}
