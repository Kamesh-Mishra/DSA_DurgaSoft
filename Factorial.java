import java.util.Scanner;

public class Factorial {

    static int logic1(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact = fact*i;
        }
        return fact;
    }

    static int logic2(int a){
        if(a==1 || a==0)
            return 1;
        else
            return a*logic2(a-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sc.close();
        
        System.out.println("Factorial is : "+logic1(a));
        System.out.println("Factorial is : "+logic2(a));
    }
}
