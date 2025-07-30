package Bit_Manipulations;

// bit level operations:
// ---------------------
// getting ith bit from a binary number
// setting ith bit in a binary number
// clearing ith bit in a binary number
// updating ith bit in a binary number


// get ith bit:


public class Bit4 {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        //19 ------>  10011
        System.out.println(getIthBit(19,0));
        System.out.println(getIthBit(19,1));
        System.out.println(getIthBit(19,2));
        System.out.println(getIthBit(19,3));
        System.out.println(getIthBit(19,4));

    }
}
