import java.util.*;

public class CollectionP1 {

    /*static void printArrayDequeueExample(){
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        dq.offerFirst(23);
        dq.offerFirst(34);
        dq.offerFirst(45);
        dq.offerLast(78);
        dq.offerLast(88); // 45,34,23,78,88
       // System.out.println(dq);
       // System.out.println(dq.peekLast());
//        dq.pollFirst();
//        System.out.println(dq);
        for (Integer i:dq){
            System.out.println(i);
        }
    }*/
    static void priorityQueueExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek());
//        for (Integer i:pq
//             ) {
//            System.out.println(i);
//
//        }

        System.out.println(pq.poll());
        System.out.println("After deletion");

    }

    public static void main(String[] args) {
        //  printArrayDequeueExample();
        priorityQueueExample();
//        ArrayList<Integer> aL1 = new ArrayList<>(5);
//        ArrayList<Integer> aL2 = new ArrayList<>(5);
//        aL1.add(34);
//        aL1.add(31);
//        aL1.add(76);
//        aL1.add(65);
//
//        aL2.add(434);
//        aL2.add(789);
//        aL2.add(98);
//        aL2.add(534);
//
//        System.out.println(aL1);
//        //Accessing the arrayList using .get method only in arrayList.
//        for (int i = 0; i < aL1.size(); i++) {
//            System.out.println(aL1.get(i));
//        }
//
//        //Accessing using for-each loop.
//        System.out.println("Using forEach loop.");
//
//        for(Integer x: aL1){
//            System.out.println(x);
//        }
//
//        System.out.println();
//        for (var x :aL2){
//            System.out.println(x);
//        }
//
    }
}
