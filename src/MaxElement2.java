// Find the maximum array element without sorting.
public class MaxElement2 {
    static int maxNumber(int[] Arr) {
        int max = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] Arr = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        System.out.println(maxNumber(Arr) + " is the largest element .");
    }
}
