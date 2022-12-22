//Concrete class.
abstract class Super {
    Super() {
        System.out.println("This is Super.");
    }

    public void meth1() {
        System.out.println("This is method1.");
    }

    //abstract method
    abstract public void meth2();
}

class Sub extends Super {
    public void meth2() {
        System.out.println("This is the method 2.");
    }

    ;
}

public class PractisingAbstract {
    public static void main(String[] args) {
        Sub s = new Sub();

        s.meth1();
        s.meth2();
    }


}
