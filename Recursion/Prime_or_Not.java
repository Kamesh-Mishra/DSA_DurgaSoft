package Recursion;

import java.util.Scanner;

public class Prime_or_Not {
    
    static boolean isprime(int n, int i){
        if(i==1)
            return true;
        else if(n%i==0)
            return false;
        else    
            return isprime(n, --i);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = obj.nextInt();
        obj.close();
		System.out.println(isprime(a,a/2));
    }
}
