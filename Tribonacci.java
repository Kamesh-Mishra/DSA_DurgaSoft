import java.util.ArrayList;
import java.util.Scanner;

public class Tribonacci {
    
    static ArrayList<Integer> trib(int n){

        int a,b,c,d,i;
        ArrayList<Integer> al = new ArrayList<>();
        a=0;
        b=1;
        c=2;
        al.add(a);
        al.add(b);
        al.add(c);

        for(i=1;i<=n-3;i++){
            d=a+b+c;
            al.add(d);
            a=b;
            b=c;
            c=d;
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sc.close();
        
        System.out.println(trib(a));
    }
}
