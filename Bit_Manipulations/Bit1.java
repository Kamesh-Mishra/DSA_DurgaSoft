package Bit_Manipulations;


// Bitwise operators

// 1) bitwise and &
// 2) bitwise or |
// 3) bitwise x-or ^
// 4) bitwise left shift <<
// 5) bitwise right sift >>
// 6) bitwise complement ~


public class Bit1 {

    public static void main(String[] args) {
        
        // bitwise and &
        System.out.println("bitwise and & ");
        int a = 5, b = 9;
		System.out.println(a&b);//1

        System.out.println("***********************");
        System.out.println("bitwise or | ");
        // bitwise or | 
        int c = 5, d = 9;
		System.out.println(c|d);//13

        System.out.println("***********************");
        System.out.println("bitwise x-or ^ ");
        // bitwise x-or ^
        int e = 5, f = 9;
		System.out.println(e^f);//12

        
        System.out.println("***********************");
        System.out.println("bitwise left shift ");
        // bitwise left shift
        int g = 5;
		System.out.println(g);//5
		System.out.println(g<<1);//10
		System.out.println(g<<2);//20
		System.out.println(g<<3);//40

        
        System.out.println("***********************");
        System.out.println("bitwise left shift ");
        // bitwise left shift
        int h = 5;
		System.out.println(h);//5
		System.out.println(h>>1);//2
		System.out.println(h>>2);//1
		System.out.println(h>>3);//0


        
        System.out.println("***********************");
        System.out.println("bitwise complement: ");

        // bitwise complement: 

        System.out.println(~5);//-(5+1)=-6
		System.out.println(~7);//-(7+1)=-8
		System.out.println(~1);//-(1+1)=-2
		System.out.println(~-2);//-(-2+1)=-(-1)=1


    }
    
}
