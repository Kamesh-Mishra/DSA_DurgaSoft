package Stack;

import java.util.Stack;

// balanced parethesis application

public class Stack11 {
    static boolean isBalancedParenthesis(String exp){
        Stack<Character> s = new Stack<Character>();
        for(char ch: exp.toCharArray()){
            switch (ch) {
                case '(':
                case '[':
                case '{':   s.push(ch); break;
                
                case ')':   
                            if(s.pop()!='(')
                                return false;
                            break;
                case ']':   
                            if(s.pop()!='[')
                                return false;
                            break;
                case '}':
                            if(s.pop()!='{')
                                return false;
                            break;
            }
        }
        return s.empty();
    }

    public static void main(String[] args) {
        System.out.println(isBalancedParenthesis("()"));
        System.out.println(isBalancedParenthesis("()[{}"));
    }
}
