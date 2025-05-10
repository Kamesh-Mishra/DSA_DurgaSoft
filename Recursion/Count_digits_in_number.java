package Recursion;

import java.util.Scanner;

public class Count_digits_in_number {
    
    static int c=0;
    static int count(int n){
        if(n!=0){
            c++;
            count(n/10);
        }
            
        return (c!=0)?c:1;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = obj.nextInt();
        obj.close();
		System.out.println(count(a));
    }
}
