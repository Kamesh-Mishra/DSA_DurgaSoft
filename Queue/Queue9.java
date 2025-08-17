package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

// Deque:
// ------
// 1) it is introduced in 1.6 version.
// 2) child interface to Queue interface.
// 3) Deque means double ended queue.
// 4) Deque allows insertion and deletions from both ends.


public class Queue9 {
   public static void main(String[] args) {
    Deque dq = new ArrayDeque();
    System.out.println(dq);
    dq.addFirst(111);
    dq.addFirst(222);
    System.out.println(dq);
    dq.offerFirst(333);
    dq.offerFirst(444);
    System.out.println(dq);
    dq.addLast(999);
    System.out.println(dq);
    dq.offerLast(888);
    System.out.println(dq);
   } 
}
