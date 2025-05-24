package Recursion;

import java.util.Scanner;

public class Sum_of_digits_in_number {
    
    static int sum(int n){
        if(n==0)
            return 0;
        else
            return (n%10)+sum(n/10);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = obj.nextInt();
        obj.close();
		System.out.println(sum(a));
    }


}