package Recursion;

import java.util.Scanner;

public class Multiply_product {

    //05. Implement a program to calculate product of two integer values (a*b)

    static int product(int a,int b){
        if(b<a)
            return product(b,a);
        else if(b!=0)
            return a+product(a, b-1);
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = obj.nextInt();
		System.out.println("Enter b value:");
		int b = obj.nextInt();
        obj.close();
		System.out.println(product(a,b));
    }
    
}
