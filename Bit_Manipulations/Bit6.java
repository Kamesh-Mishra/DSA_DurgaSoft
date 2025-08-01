package Bit_Manipulations;

// clear ith bit:

public class Bit6 {
    
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        //19 ---> 10011
        System.out.println(clearIthBit(19, 0));
        System.out.println(clearIthBit(19, 1));
        System.out.println(clearIthBit(19, 2));
        System.out.println(clearIthBit(19, 3));
        System.out.println(clearIthBit(19, 4));
    }
}
