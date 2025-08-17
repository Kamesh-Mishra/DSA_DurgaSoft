package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue8 {
   public static void main(String[] args) {
    Queue q = new PriorityQueue();
    System.out.println(q);
    q.offer(111);
    q.offer(222);
    q.offer(333);
    q.offer(444);

    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.remove());
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.remove());
    System.out.println(q);

    System.out.println(q.poll());  // null
    System.out.println(q.remove());  // RE: NoSuchElementException

   } 
}
