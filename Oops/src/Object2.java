import java.lang.reflect.InvocationTargetException;

class MyStudent {
    public MyStudent() {
        System.out.println("This is my student");
    }

    public int clg_id = 302;
}

public class Object2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //Creating object using newInstance() of Class class.
        MyStudent m1 = MyStudent.class.getDeclaredConstructor().newInstance();
        System.out.println(m1);
        System.out.println(m1.clg_id);
    }
}
