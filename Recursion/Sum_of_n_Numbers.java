package Recursion;

import java.util.Scanner;

public class Sum_of_n_Numbers {


    static int sum(int n){
        if(n==1)
           return 1;
        else
            return n+sum(n-1);

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
        obj.close();
		System.out.println(sum(n));
    }
}