class Student {
    public int clg_id = 101;

    public Student() {
        System.out.println("This is a constructor class.");
    }
}

public class Object1 implements Cloneable {
    public static void main(String[] args) {
        // Creating constructor using new keyword.
        Student s1 = new Student();
        System.out.println(s1.clg_id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
