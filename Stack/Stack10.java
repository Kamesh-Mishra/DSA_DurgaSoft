package Stack;

import java.util.Stack;

// reverse of the stack

public class Stack10 {
    static void bottomInsert(Stack<Integer> ss, int value){
        int temp;
        if(ss.empty())
            ss.push(value);
        else{
            temp = ss.pop();
            bottomInsert(ss, value);
            ss.push(temp);
        }
    }

    static void reverseStack(Stack<Integer> ss){
        if(ss.empty())
            return;
        else{
            int temp = ss.pop();
            reverseStack(ss);
            bottomInsert(ss, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);

    }
}
