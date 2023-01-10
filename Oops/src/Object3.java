import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MyNewStudent {

    public MyNewStudent() {
        System.out.println("Constructor class my new student.");
    }

    public int error_code = 3445;
}


public class Object3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

        //Constructing an object using Constructor newInstance() method.
        Constructor<MyNewStudent> ctr = MyNewStudent.class.getConstructor();
        MyNewStudent stu1 = ctr.newInstance();
        System.out.println(stu1.hashCode());

        System.out.println(stu1.error_code);

        System.out.println("*******************");
        //Object creation using clone method
        // Student stu2 = (Student) stu1.clone();
        //ystem.out.println(stu2);

    }
}
