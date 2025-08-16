package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

// predefined queue implementation:
// --------------------------------

// Collection(I) -----> Queue(I)

// Queue(I) ----------> PriorityQueue(C)
// Queue(I) ----------> BlockingQueue(I) 
// Queue(I) ----------> Deque(I)


public class Queue7 {

    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        System.out.println(q);
        q.offer(111);
        q.offer(222);
        q.offer(333);
        q.offer(444);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());

        System.out.println("************************");

        Queue q2 = new PriorityQueue();
        System.out.println(q2);
        System.out.println(q2.peek());
        System.out.println(q2.element());
    }
}
