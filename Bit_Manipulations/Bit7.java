package Bit_Manipulations;

// update ith bit:

public class Bit7 {
     
    public static int updateIthBit(int n,int i, int nb){
        if(nb==0)
            return clearIthBit(n,i);
        else
            return n;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    public static void main(String[] args) {
        //19 ----> 10011
        System.out.println(updateIthBit(19, 0, 0)); // 10011=>10010=>18
        System.out.println(updateIthBit(19, 0, 1)); // 10011=>10011=>19
        System.out.println(updateIthBit(19, 1, 0)); // 10011=>10001=>17
        System.out.println(updateIthBit(19, 1, 1)); // 10011=>10011=>19
        System.out.println(updateIthBit(19, 2, 0)); // 10011=>10011=>19
        System.out.println(updateIthBit(19, 2, 1)); // 10011=>10011=>19
        
    }
}
