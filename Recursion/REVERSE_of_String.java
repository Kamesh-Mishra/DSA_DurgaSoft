package Recursion;

import java.util.Scanner;

public class REVERSE_of_String {
    
    static String reverse(String s){
        if(s==null || s.length()<=1)
            return s;
        return reverse(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = obj.nextLine();
        obj.close();
		System.out.println(reverse(s));
    }
}
