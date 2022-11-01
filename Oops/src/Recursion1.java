public class Recursion1 {
    public static int printFact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * printFact(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFact(n) + " is the factorial of " + n);

    }
}
