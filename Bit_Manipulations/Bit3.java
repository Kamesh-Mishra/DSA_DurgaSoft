package Bit_Manipulations;

import java.util.Scanner;

// swaping of two numbers:

public class Bit3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = obj.nextInt();
        System.out.println("Enter b value : ");
        int b= obj.nextInt();

        System.out.println("Before swapping : a= "+a+" and b= "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("after swapping : a= "+a+" and b= "+b);
    }
}
