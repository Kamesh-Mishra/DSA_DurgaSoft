package Recursion;

import java.util.Scanner;

public class Count_occurence_of_char {

    static int count(String s, char ch, int index){

        if(index<0)
            return 0;

        //if(s.charAt(index)=='x')
		//if(s.charAt(index)=='a'||s.charAt(index)=='e'||s.charAt(index)=='i'||s.charAt(index)=='o'||s.charAt(index)=='u')

        if(s.charAt(index)==ch)
            return 1+count(s, ch, index-1);
        else
            return count(s,ch,index-1);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s = obj.nextLine();
        obj.close();
		System.out.println(count(s,'a',s.length()-1));
    }
}