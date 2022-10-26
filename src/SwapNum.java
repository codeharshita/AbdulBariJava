public class SwapNum {
    public static void swapNum(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swapping the numbers are: " + x + " and " + y);
    }

    public static void main(String[] args) {
        swapNum(3, 5);
    }
}
