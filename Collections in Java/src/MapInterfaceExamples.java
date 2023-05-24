import java.util.*;

public class MapInterfaceExamples {

    static void PrintHashTable() {
        Hashtable ht = new Hashtable();
        ht.put(1, "S");
        ht.put(2, "D");
        ht.put(2, "A");
        ht.put(2, "B");
        ht.put(2, "C");
        System.out.println(3);
        System.out.println(ht);


    }

    public static void main(String[] args) {
        PrintHashTable();
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
