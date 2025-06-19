package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*

    Array Rotations:
    ~~~~~~~~~~~~~~~~
Ex:
---
	[1, 2, 3, 4, 5] ---> Left Rotations

						[2, 3, 4, 5, 1] ---> 1
						[3, 4, 5, 1, 2] ---> 2
						[4, 5, 1, 2, 3] ---> 3
						[5, 1, 2, 3, 4] ---> 4
						[1, 2, 3, 4, 5] ---> 5

	[1, 2, 3, 4, 5] ---> Right Rotations

						[5, 1, 2, 3, 4] ---> 1
						[4, 5, 1, 2, 3] ---> 2
						[3, 4, 5, 1, 2] ---> 3
						[2, 3, 4, 5, 1] ---> 4


we can perform these rotations in the following ways


Method1 ----> Brute Force
Method2 ----> by using temp variable
Method3 ----> by using temp array ---> m1
Method4 ----> by using temp array ---> m2
Method5 ----> by using reversal algo


1) Brute Force
--------------
Rotate all the elements by one position towards left/right direction for 'r' rotations.

n----> array size
a----> array
r----> number of rotations


Note:
-----
		r=r%n
		n=5, r=1 -----> r=0 -------------------> r=1%5=1
		n=5, r=2 -----> r=0,1 -----------------> r=2%5=2
		n=5, r=3 -----> r=0,1,2 ---------------> r=3%5=3
		n=5, r=4 -----> r=0,1,2,3 -------------> r=4%5=4
		n=5, r=5 -----> loop wn't execute -----> r=5%5=0
		n=5, r=6 -----> r=0             -------> r=6%5=1


 */


public class Arrays38 {

    static int[] rotateLeft(int[] a, int r){
        int temp,prev,i,j;
        for(i=0;i<r;i++){
            prev=a[0];
            for(j=a.length-1;j>=0;j--){
                temp= a[j];
                a[j]=prev;
                prev=temp;
            }
        }
        return a;
    }

    static int[] rotateRight(int[] a, int r){
        int temp,prev,i,j;
        for(i=0;i<r;i++){
            prev=a[0];
            for(j=a.length-1;j>=0;j--){
                temp= a[j];
                a[j]=prev;
                prev=temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		int a[] = {1, 2, 3, 4, 5};

		System.out.println("Enter number of rotations(r):");
		int r = obj.nextInt();

		System.out.println("Before Rotation==>"+Arrays.toString(a));
		a=rotateLeft(a,r);
		System.out.println("After Rotation ==>"+Arrays.toString(a));
	}

}
    
