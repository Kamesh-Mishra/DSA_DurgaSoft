package Recursion;

import java.util.Scanner;

public class HCF_GCD {
    static int hcf(int a, int b){
        while(a!=b)
		{
			if(a>b)
				return hcf(a-b,b);
			else
				return hcf(a,b-a);
		}
		return a;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter n1 value:");
		int n1=obj.nextInt();
		System.out.println("Enter n2 value:");
		int n2=obj.nextInt();
        obj.close();
		System.out.println(hcf(n1,n2));
    }
}
