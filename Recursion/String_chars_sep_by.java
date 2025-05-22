package Recursion;

import java.util.Scanner;

// 16) Implement a program to return a new String, where all the 
//        adjacent characters are seperated by a "*".

public class String_chars_sep_by {
    
    static String newS(String s, int index){
        if(index<1)
            return s.substring(0,index+1); //s.charAt(index)+"";
        return newS(s,index-1)+'*'+s.charAt(index);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s = obj.nextLine();
        obj.close();
		System.out.println(newS(s,s.length()-1));
    }
}
