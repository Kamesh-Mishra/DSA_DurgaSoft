package Recursion;

import java.util.Scanner;

public class Replace_char_in_string {
    static String replace(String s,int index){

        if(index<0)
            return "";
        if(s.charAt(index)=='x')
            return replace(s, index-1)+'y';
        else
            return replace(s, index-1)+s.charAt(index);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s = obj.nextLine();
        obj.close();
		System.out.println(replace(s,s.length()-1));
    }

}
