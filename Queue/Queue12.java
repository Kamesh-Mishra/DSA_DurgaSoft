package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue12 {
        public static void main(String[] args) {
            Deque dq = new ArrayDeque();
            System.out.println(dq);//[]
            dq.addFirst(111);
            dq.addFirst(222);
            dq.offerFirst(333);
            dq.offerFirst(444);
            dq.addLast(999);
            dq.offerLast(888);
            System.out.println(dq);//[444,333,222,111,999,888]
            System.out.println(dq.removeLast());//888
            System.out.println(dq);//[444,333,222,111,999]
            System.out.println(dq.pollLast());//999
            System.out.println(dq);//[444,333,222,111]

            System.out.println("**************************");

            Deque dq2 = new ArrayDeque();
            System.out.println(dq2);//[]
            System.out.println(dq2.pollLast());//null
            System.out.println(dq2.removeLast());//RE: NoSuchElementException

        }
  
}
