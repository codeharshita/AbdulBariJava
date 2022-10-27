public class ReverseNumber {
    public static int reverse(int n) {
        int val = 0;
        while (n != 0) {
            int rem = n % 10;
            val = val * 10 + rem;
            n = n / 10;

        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(reverse(34567896));
    }

}
//Program ends.
