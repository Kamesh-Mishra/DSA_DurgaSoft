import java.util.Scanner;

public class Max_of_three_integers {
    static int logic1(int a,int b,int c){
        return (a>b && a>c)?a:((b>c)?b:c);
    }

    static int logic2(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value ");
        int a = sc.nextInt();
        System.out.println("Enter b value ");
        int b = sc.nextInt();
        System.out.println("Enter c value ");
        int c = sc.nextInt();
        sc.close();
        System.out.println("Max value is  "+ logic1(a,b,c));
        System.out.println("Max value is  "+ logic2(a,b,c));
    }
}
