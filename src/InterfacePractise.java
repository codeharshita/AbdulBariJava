interface Test {
    void meth1();

    void meth2();
}

class MyTest implements Test {
    public void meth1() {
        System.out.println("This is meth 1.");
    }

    public void meth2() {
        System.out.println("This is meth 2.");
    }

    public void meth3() {
        System.out.println("This is meth 3.");
    }
}

public class InterfacePractise {
    public static void main(String[] args) {
        Test t; // Reference of the interface
        t = new MyTest(); // object of the MyTest class

        // Test t = new MyTest();  ...Dynamic Method Dispatch.
        t.meth1();
        t.meth2();

        // Can't use meth3 as the reference is of MyTest class.

    }
}
