public class ShiftElements {
    public static void main(String[] args) {
          int[] a= {4,7,8,9,6,3};
          int temp = a[0];

          for(int i =1; i<a.length; i++){
              System.out.println(a[i]);
          }
          a[a.length-1]= temp;
        System.out.println(temp);
    }
}
