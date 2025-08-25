package Priority_Queus_Heaps;


import java.util.Collections;
import java.util.PriorityQueue;

// predefined implementation of PQ:
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

// Ex1:

public class Test1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());  // first most element
            pq.remove();   // first element will be removed
        }
        System.out.println("************************************");

        // Ex2:
        // ----

        // sort integer values based on desc order using PQ

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(3);
        pq2.add(4);
        pq2.add(1);
        pq2.add(7);

        while (!pq2.isEmpty()) {
            System.out.println(pq2.peek());  // first most element
            pq2.remove();
        }
    }
}
