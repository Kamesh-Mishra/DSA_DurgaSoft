package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays39 {
    static int[] rotateRight(int a[],int r)
	{
		int temp,prev,i,j;
		for(i=0;i<r;i++)
		{
			prev=a[a.length-1];
			for(j=0;j<a.length;j++){
				temp=a[j];
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
		a=rotateRight(a,r);
		System.out.println("After Rotation ==>"+Arrays.toString(a));

    }
}
