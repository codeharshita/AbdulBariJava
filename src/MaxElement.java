// My Logic

import java.util.*;

public class MaxElement {
    static void maxNum(int[] arr) {
        int maxElement;
        Arrays.sort(arr);
        for (int k : arr) {
            System.out.println(k);
        }
        maxElement = arr[arr.length - 1];
        System.out.println(maxElement + " is the largest element in the array ");
    }

    public static void main(String[] args) {

        int[] arr = {3, 12, 4, 5, 54, 33, 78, 76, 99, 34, 56};
        maxNum(arr);

    }

}
