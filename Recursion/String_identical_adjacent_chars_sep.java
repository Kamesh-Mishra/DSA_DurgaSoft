package Recursion;

import java.util.Scanner;

/* 
17) Implement a program to return new string where identical adjcent 
        chars are sep by *

Ex:
abc ----> abc
hello --> hel*lo
xxyy ---> x*xy*y 
*/

public class String_identical_adjacent_chars_sep {
    static String newS(String s, int index){

        if(index<1)
            return s.substring(0,index+1);
        if(s.charAt(index-1)==s.charAt(index))
            return newS(s,index-1)+"*"+s.charAt(index);
        else
            return newS(s,index-1)+s.charAt(index);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s = obj.nextLine();
        obj.close();
		System.out.println(newS(s,s.length()-1));
    }
}
