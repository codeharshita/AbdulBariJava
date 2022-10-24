public class Methods1 {
    static void update(int[] a){
        a[3]=5;
    }
    public static void main(String[] args) {
        int[] a ={3,2,1,9,8};
        update(a);
        System.out.println(a[3]);
    }
}
