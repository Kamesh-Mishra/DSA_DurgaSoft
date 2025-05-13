package Recursion;

import java.util.Scanner;

/* 
20) IMP to count the number of times given string appeared in 
        the original string?

"python is very very easy programming" ----> 2
"java is very easy" -----------------------> 1
"c programming is easy" -------------------> 0

*/
public class Count_word_in_given_string {
    static int count(String s,int index){
        if(index<3)
            return 0;
        if (s.substring(index-3, index+1).equals("very")) 
            return 1+count(s, index-3);
        else
            return count(s,index-1);
        }


        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s = obj.nextLine();//very,3
        obj.close();
		System.out.println(count(s,s.length()-1));
        }
    }
    

