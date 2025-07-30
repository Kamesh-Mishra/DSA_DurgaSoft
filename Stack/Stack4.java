package Stack;

import java.util.Stack;

// case2: to hold String objects

public class Stack4 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();

        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.size());

        s.push("AAA");
        s.push("BBB");
        s.push("CCC");
        s.push("DDD");

        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.size());

        System.out.println(s.peek());
        System.out.println(s.search("AAA"));
        System.out.println(s.pop());
        System.out.println(s);
    }
}
