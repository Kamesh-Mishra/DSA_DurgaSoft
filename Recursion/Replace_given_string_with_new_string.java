package Recursion;

import java.util.Scanner;

/*
 * 
 * 
 * 21) IMP to replace the given string with new string?
----------------------------------------------------

xpix ----> x3.147x
pip -----> 3.147p
abc -----> abc
ab ------> ab
a -------> a
 */
public class Replace_given_string_with_new_string {
    static String replace(String s, int index){

        if(index<1)
            return s.substring(0,index+1);
        if(s.substring(index-1,index+1).equals("pi"))
            return replace(s, index-2)+"3.147";
        else
            return replace(s, index-1)+s.charAt(index);
    }    

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s = obj.nextLine();//very,3
        obj.close();
		System.out.println(replace(s,s.length()-1));
    }
}
