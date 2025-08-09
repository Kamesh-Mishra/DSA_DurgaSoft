package Stack;

import java.util.Stack;

// postfix evaluation Implementation 

public class Stack14 {
    static int precedence(char ch){
        if(ch=='*' && ch=='/')
            return 2;
        if(ch=='+' && ch=='-')
            return 1;
        return -1;
    }

    static String infixToPostfix(String s){
        String output = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                output = output +ch;
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')'){
                while (!stack.empty() && stack.peek()!='(') {
                    output = output + ch;
                    stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.empty() && precedence(ch)<=precedence(stack.peek())){
                    output = output+stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.empty()) {
            output = output + stack.peek();
            stack.pop();
        }
        return output;
    }

    static int evalPostfix(String s){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                stack.push(ch-'0');
            else{
                int v1 = stack.pop();
                int v2 = stack.pop();
                switch(ch){
                    case '+': stack.push(v2+v1); break;
                    case '-': stack.push(v2-v1); break;
                    case '*': stack.push(v2*v1); break;
                    case '/': stack.push(v2/v1); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evalPostfix(infixToPostfix("2+3")));
    }

}
