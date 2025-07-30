package Bit_Manipulations;


// set ith Bit:

public class Bit5 {
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n ^ bitMask;
    }

    public static void main(String[] args) {
        //19 ---> 10011
        System.out.println(setIthBit(19, 0));
        System.out.println(setIthBit(19, 1));
        System.out.println(setIthBit(19, 2));
        System.out.println(setIthBit(19, 3));
        System.out.println(setIthBit(19, 4));
    }
}
