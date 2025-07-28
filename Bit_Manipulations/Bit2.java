package Bit_Manipulations;

// even or odd number application:

// if LBS is 0 then the given number is even
// if LSB is 1 then the given number is odd

public class Bit2 {
    static String eveOrOdd(int n){
        int bitMask = 1;
        if((n&bitMask)==0)
            return "Even Number";
        else
            return "Odd Number";
    }

    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
            System.out.println(i+"\t"+eveOrOdd(i));
    }
}
