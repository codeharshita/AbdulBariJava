public class RemovePrf1 {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        int remove = 4;

        for(int i =0; i<arr.length; i++){
            if(arr[i] == remove){
                continue;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
