package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// 2) by using 'temp' variable

public class Arrays40 {
    static int[] rotateLeft_Temp(int a[],int r)
	{
		r=r%a.length;

		int temp, i, j;

		for(i=0;i<r;i++)
		{
			temp=a[0];
			for(j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}

		return a;
	}

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

		int a[] = {1, 2, 3, 4, 5};

		System.out.println("Enter number of rotations(r):");
		int r = obj.nextInt();

		System.out.println("Before Rotation==>"+Arrays.toString(a));
		a=rotateLeft_Temp(a,r);
		System.out.println("After Rotation ==>"+Arrays.toString(a));
    }
}
