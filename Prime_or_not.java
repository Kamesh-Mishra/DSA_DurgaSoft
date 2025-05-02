import java.util.Scanner;

public class Prime_or_not {

    static String logic1(int a){
        int factors = 0;
        for(int i=1; i<=a; i++){
            if(a%i==0)
                factors++;
        }
        return ((factors==2)?"Prime":"Not Prime");
    }

    static boolean logic2(int a, int i){
        if(i==1 )
            return true;
        else if(a%i==0)
            return false;
        else 
            return logic2(a, --i);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sc.close();
        
        System.out.println("number is : "+logic1(a));
        System.out.println("number is : "+logic2(a, a/2));

    }
    
}
