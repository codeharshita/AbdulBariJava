import java.util.*;

public class MapInterfaceExamples {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5);
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F");
        lhm.put(7, "G");
        lhm.put(8, "K");
        System.out.println(lhm.get(3));
        System.out.println("********************");
        System.out.println(lhm.entrySet());
        for (Map.Entry<Integer, String> lh : lhm.entrySet()) {
            System.out.println(lh);
        }
    }
}
