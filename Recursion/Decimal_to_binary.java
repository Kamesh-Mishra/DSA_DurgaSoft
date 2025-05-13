package Recursion;

import java.util.Scanner;

public class Decimal_to_binary {
    

    static int convert(int n){
        if(n==0)
            return 0;
        else
            return (n%2+10*convert(n/2));
    }

    static void convert_v2(int n){
        if(n==0)
            System.out.println("");
        else
            convert_v2(n/2);
            System.out.println(n%2);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
        obj.close();
		System.out.println(convert(n));
        convert_v2(n);
        
        
    }
}
