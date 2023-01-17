import java.util.*;

public class CollectionP1 {
    public static void main(String[] args) {
        ArrayList<Integer> aL1 = new ArrayList<>(5);
        aL1.add(34);
        aL1.add(31);
        aL1.add(76);
        aL1.add(65);

        System.out.println(aL1);
        //Accessing the arrayList using .get method only in arrayList.
        for (int i = 0; i < aL1.size(); i++) {
            System.out.println(aL1.get(i));
        }
    }
}
