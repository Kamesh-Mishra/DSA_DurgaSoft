package Swap_two_integers;
import java.util.Scanner;

class Demo {
    static void swap(int a, int b) {
        System.out.println("before swapping a= "+ a +" and b= "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("after swapping a = "+a+ " and b = "+b);
    }
}


public class Logic4 {
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
