public class Practise3 {
    public static int negativeInput(int i) {
        if (i >= 0) {
            System.out.println("this is new");
            ;
        }
        return i;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Practise3.negativeInput(-1));
            System.out.println("Try block executed.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Catch block is executed.");
        } finally {
            System.out.println("Finally");
        }


    }
}
