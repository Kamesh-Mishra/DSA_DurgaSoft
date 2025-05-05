package Max_of_two_integers;

import java.util.Scanner;

class Demo{
    static int max(int a, int b){
        return Math.max(a, b);
    }
}
public class Logic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value ");
        int a = sc.nextInt();
        System.out.println("Enter b value ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Max value is  "+Demo.max(a, b));
    }
}
