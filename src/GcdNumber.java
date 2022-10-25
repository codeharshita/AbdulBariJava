public class GcdNumber {
    public static void main(String[] args) {
        int m = 36, n = 60;
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        System.out.println(" GCD " + m);
    }
}
