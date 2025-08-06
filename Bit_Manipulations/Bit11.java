package Bit_Manipulations;

// increment a number by one unit

public class Bit11 {
    public static int increment(int n){
        return -~n;
    }
    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
            System.out.println(i +"\t"+ increment(i));
    }
}
