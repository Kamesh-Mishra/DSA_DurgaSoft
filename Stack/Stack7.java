package Stack;

import java.util.Stack;

// sorted insertion into stack

public class Stack7 {
    static void sortedInsert(Stack<Integer> ss, int value){
        int temp;
        if(ss.empty() || value>ss.peek())
            ss.push(value);
        else{
            temp = ss.pop();
            sortedInsert(ss, value);
            ss.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(3);
        s.push(4);
        System.out.println(s);
        sortedInsert(s, 2);
        System.out.println(s);
    }
}
