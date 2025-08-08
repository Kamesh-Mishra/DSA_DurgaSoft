package Stack;

import java.util.Stack;

// implementation of infix to postfix algorithm

public class Stack12 {
    static int precedence(char ch){
        if(ch=='*' || ch=='/')
            return 2;
        if(ch=='+' || ch=='-')
            return 1;
        return -1;
    }

    static String infixToPostfix(String s){
        String output = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                output = output + ch;
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')'){
                while(!stack.empty() && stack.peek() != '('){
                    output = output + ch;
                    stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.empty() && precedence(ch)<=precedence(stack.peek())){
                    output = output + stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.empty()){
            output = output + stack.peek();
            stack.pop();
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b"));
        System.out.println(infixToPostfix("a*b+c"));
        System.out.println(infixToPostfix("a+b*c"));
    }
}
