package Recursion;

import java.util.Scanner;

public class Exponant {
 
    static int power(int a, int b){
        if(b>=1)
            return a*power(a,b-1);
        else
            return 1;
        }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
        int b = obj.nextInt();
        obj.close();
		System.out.println(power(a,b));
    }
}
