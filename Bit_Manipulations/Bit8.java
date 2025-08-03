package Bit_Manipulations;

// clear last i bits:
// ------------------
// 19 -----> 10011

// clear 1 -----> 10010
// clear 2 -----> 10000
// clear 3 -----> 10000
// clear 4 -----> 10000
// clear 5 -----> 00000

public class Bit8 {
    public static int clearLastIBits(int n, int i){
        int bitMask = (-1)<<i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        //19  ----> 10011
        System.out.println(clearLastIBits(19, 1));  //10010=>10010=>18
        System.out.println(clearLastIBits(19, 2));  //10010=>10000=>16
        System.out.println(clearLastIBits(19, 3));  //10010=>10000=>16
        System.out.println(clearLastIBits(19, 4));  //10010=>10000=>16
        System.out.println(clearLastIBits(19, 5));  //10010=>00000=>0

    }
}
