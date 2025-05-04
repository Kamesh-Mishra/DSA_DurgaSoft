import java.util.Scanner;

class Demo{
    static String evenOdd(int a){
        return (a%2==0)?"even":"odd";
    }
}
public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sc.close();
        System.out.println("number is  "+Demo.evenOdd(a));
    }
    
}
