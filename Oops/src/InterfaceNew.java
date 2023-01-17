interface MyInterface {
    static void print() {
        System.out.println("This is interface");
    }

    void run();
}

public class InterfaceNew {
    public void run() {
        System.out.println("The boy is running.");
    }

    public static void main(String[] args) {
        InterfaceNew obj = new InterfaceNew();
        obj.run();
        MyInterface.print();


    }
}
