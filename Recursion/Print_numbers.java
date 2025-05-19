package Recursion;

import java.util.Scanner;

public class Print_numbers {
    
    static void print(int n){
        if(n>=1){
            print(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		print(n);
        obj.close();
    }
}
