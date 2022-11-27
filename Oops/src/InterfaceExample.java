interface Test3 {
    int X = 56;// this static and final.

    public void meth1();

    void meth2();

    public static void meth3() {
        System.out.println("This is method 3.");
    }
}

interface TestNew1 extends Test3 {
    public static void meth4() {
        System.out.println("This is the method 4.");
    }
}

//concrete class.
class MyTest implements Test3 {
    @Override
    public void meth1() {
        System.out.println("This is the method 1");
    }

    @Override
    public void meth2() {
        System.out.println("This is the method 2");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        MyTest t = new MyTest();
        t.meth1();
        t.meth2();

        System.out.println(Test3.X);
        Test3.meth3();

        TestNew1.meth4();

    }
}
