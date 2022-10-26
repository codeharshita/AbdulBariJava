public class SumNumber {

    public static int printAdd(int n) {

        int val = 0, sum = 0;

        while (n != 0) {
            int rem = n % 10;
            // val = val * 10 + rem;
            sum = sum + rem;
            n = n / 10;

        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(printAdd(3214));
    }
}
