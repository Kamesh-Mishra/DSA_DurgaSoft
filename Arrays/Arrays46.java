package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// 5) by using reversal algorithm


public class Arrays46 {
    
    
    static void reverse(int a[],int s,int e){
		int temp;
		while(s<e){
			temp=a[s];
			a[s]=a[e];
			a[e]=temp;
			s++;
			e--;
		}
	}
	static int[] rotateLeft_reversal(int a[],int r){
		r=r%a.length;
		reverse(a,0,r-1);
		reverse(a,r,a.length-1);
		reverse(a,0,a.length-1);
		return a;
	}

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		int a[] = {1, 2, 3, 4, 5};

		System.out.println("Enter number of rotations(r):");
		int r = obj.nextInt();

		System.out.println("Before Rotation==>"+Arrays.toString(a));
		a=rotateLeft_reversal(a,r);
		System.out.println("After Rotation ==>"+Arrays.toString(a));
    }
}
