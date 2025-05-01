import java.util.Scanner;

public class Sum_of_N_numbers {

    static int logic1(int a){
        int sum = 0;
        for(int i=1; i<=a; i++){
            sum = sum+i;
        }
        return sum;
    }

    static int logic2(int a){
        if(a==0)
            return 0;
        else
            return a+logic2(a-1);

    }

    static int logic3(int a){
        return a*(a+1)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sc.close();
        
        System.out.println(logic1(a));
        System.out.println(logic2(a));
        System.out.println(logic3(a));
    }
    
}
