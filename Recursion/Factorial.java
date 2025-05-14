package Recursion;

import java.util.Scanner;

public class Factorial {
    
    static int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
        obj.close();
		System.out.println(fact(n));
    }
}
