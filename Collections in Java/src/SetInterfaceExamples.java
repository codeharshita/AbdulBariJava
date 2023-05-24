import java.util.*;

public class SetInterfaceExamples {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Hyundai");
        lhs.add("Santro");
        lhs.add("INano");
        lhs.add("Suzuki");
        lhs.add("Suzuki");
        for (String str : lhs) {
            System.out.println(str);
        }
        System.out.println("*****************");
        Iterator<String> mks = lhs.iterator();
        while (mks.hasNext()) {
            System.out.println(mks.next());
        }

    }
}
