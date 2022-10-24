public class TwoDArray {
    public static void main(String[] args) {
        int [] [] a= new int[][]
                {
                {2,3},
                {6,9}
        };

        for(int i = 0; i<a.length; i++){
            for (int j = 0; j<a.length; ++j){
                System.out.println(a[i][j]);
            }
        }

    }
}
