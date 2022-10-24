public class Sum2DArray {
    public static void main(String[] args) {
        int rows= 3; int cols = 3;
        int [][] arr ={{1,2,3},{4,2,3},{9,8,7}};
        int [][] arr_new ={{5,4,3},{7,4,1},{1,4,2}};

        // Adding two matrix

        int[][] newArr = new int[rows][cols];
        for(int i =0; i<arr.length; i++){
            for (int j = 0; j<arr[0].length; j++){
                newArr[i][j]= arr[i][j]+arr_new[i][j];
            }
        }
    //Displaying the results.
        System.out.println("Sum of two matrices is ");
        for (int k =0; k< newArr.length; k++){
            for (int m =0; m< newArr[0].length; m++){
                System.out.print(newArr[k][m] + " ");
            }
            System.out.println();
        }



    }
}
