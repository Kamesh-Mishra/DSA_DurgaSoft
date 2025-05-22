package Recursion;

import java.util.Scanner;

public class Reverse_of_number {
    

    static int reverse(int n, int len){
        if (n==0)
            return 0;
        else
            return ((n%10)*(int)Math.pow(10, len-1)+reverse(n/10,--len));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value:");
		String a = obj.nextLine();
        obj.close();
		System.out.println(reverse(Integer.parseInt(a),a.length()));
    }
}
