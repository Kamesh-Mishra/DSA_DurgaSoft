import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    
    static ArrayList<Integer> fib(int n){
        int a,b,c,i;

        ArrayList<Integer> al = new ArrayList<Integer>();

        a = 0;
        b = 1;
        al.add(a);
        al.add(b);
        for(i=1;i<=n-2;i++){
            c=a+b;
            al.add(c);
            a=b;
            b=c;
        }
        return al;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sc.close();
        
        System.out.println(fib(a));
    }
}
