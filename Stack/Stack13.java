package Stack;

import java.util.Stack;

// infix to prefix conversion implementation

public class Stack13 {
    static int precendence(char ch){
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
                    output = output+ch;
                    stack.pop();
                }
                stack.pop();
            }
            else{
                while (!stack.empty() && precendence(ch)<=precendence(stack.peek())) {
                    output = output+stack.peek();
                    stack.pop();
                }
                stack.push(ch);
           }
        }            
        while(!stack.empty()){
            output = output+stack.peek();
            stack.pop();
        }
        return output;
    }
    static String infixToPrefix(String s){
        String output = new String();
        output = new StringBuffer(s).reverse().toString();
        output = infixToPostfix(output);
        output = new StringBuffer(output).reverse().toString();
        return output;
    }

    public static void main(String[] args) {
        System.out.println(infixToPrefix("a+b"));//+ab
		System.out.println(infixToPrefix("a*b+c"));//+*abc
		System.out.println(infixToPrefix("a+b*c"));//+a*bc
    }
}
