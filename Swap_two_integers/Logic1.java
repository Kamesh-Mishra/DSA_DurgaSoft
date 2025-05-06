package Swap_two_integers;

import java.util.Scanner;

class Demo{
    static void swap(int a, int b){
        System.out.println("before swapping a= "+ a +" and b= "+b);

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a = "+a+ " and b = "+b);
    }
}

public class Logic1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value ");
        int a = sc.nextInt();
        System.out.println("Enter b value ");
        int b = sc.nextInt();
        sc.close();
        Demo.swap(a, b);


    }
}