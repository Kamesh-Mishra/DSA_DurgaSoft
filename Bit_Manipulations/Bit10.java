package Bit_Manipulations;

// count set bits in a number

public class Bit10 {
    public static int countSetBits(int n){
        int c=0;
        while(n!=0){
            if((n&1)!=0)
                c++;
            n=n>>1;
        }
        return c;
    }

    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
            System.out.println(i +"\t"+ countSetBits(i));
    }
}
