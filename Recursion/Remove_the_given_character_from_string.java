package Recursion;

import java.util.Scanner;

public class Remove_the_given_character_from_string {
    

    static String nox(String s, int index){
        if(index<0)
            return "";
        if(s.charAt(index)=='x')
            return nox(s,index-1);
        else
            return nox(s,index-1)+s.charAt(index);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s = obj.nextLine();
        obj.close();
		System.out.println(nox(s,s.length()-1));
        
    }
}
