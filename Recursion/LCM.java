package Recursion;

import java.util.Scanner;

public class LCM {

    static int com=1;
	
    static int lcm(int a, int b){
    
		if(com%a==0 && com%b==0)
			return com;
		com++;
		lcm(a,b);
		return com;
	
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter n1 value:");
		int n1=obj.nextInt();
		System.out.println("Enter n2 value:");
		int n2=obj.nextInt();
        obj.close();
		System.out.println(lcm(n1,n2));
    }

}

