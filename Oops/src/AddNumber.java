public class AddNumber {

    // Static keyword is used to access the
    // method in the main method.
    public static int addNum(int n, int m) {
        return n + m;
    }

    public static void main(String[] args) {
        System.out.println(addNum(6, 3) + " is the result.");
    }
}
/**
 * There are two ways to access
 * the method Use STATIC keyword
 * or create the object from the class
 * and access it using .operator in the main method.
 */