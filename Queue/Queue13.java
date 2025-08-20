package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue13 {
    public static void main(String[] args) {
        Deque dq = new ArrayDeque();
		System.out.println(dq);//[]
		dq.addLast(111);
		dq.addLast(222);
		dq.addLast(333);
		dq.addLast(111);
		dq.addLast(222);
		dq.addLast(111);
		dq.addLast(444);
		dq.addLast(555);
		System.out.println(dq);//[111,222,333,111,222,111,444,555]
		dq.removeFirstOccurrence(111);
		System.out.println(dq);//[222,333,111,222,111,444,555]
		dq.removeLastOccurrence(111);
		System.out.println(dq);//[222,333,111,222,444,555]
    }
}
