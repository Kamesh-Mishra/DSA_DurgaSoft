package Stack;

import java.util.Stack;

// predefined implementation stack class (java.util.Stack)
// -------------------------------------------------------
// case1: general implementation

public class Stack3 {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.empty());
        System.out.println(s.size());
        System.out.println(s);

        s.push(111);
        s.push(222);
        s.push(333);
        s.push(444);
        s.push(555);

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());

        System.out.println(s.search(111));
        System.out.println(s.search(888));

        System.out.println(s.peek());
        System.out.println(s.pop());

        System.out.println(s);
        System.out.println(s.peek());

    }
    

}
