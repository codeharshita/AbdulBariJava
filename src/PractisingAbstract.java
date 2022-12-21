//Concrete class.
class Super {

    Super() {
        System.out.println("This is Super.");
    }

    public void meth1() {
        System.out.println("This is method1.");
    }
}

public class PractisingAbstract {
    public static void main(String[] args) {
        Super s = new Super();
        s.meth1();
    }


}
