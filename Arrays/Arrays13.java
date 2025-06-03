package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//version4: by using predefined only but desc

public class Arrays13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int i,n = obj.nextInt();

		int a[] = new int[n];
		System.out.println("Enter "+n+" elements.");
		for(i=0;i<n;i++)
			a[i] = obj.nextInt();

		System.out.println("Array Elements Before Sorting:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");

		//version4==> by using predefined methods ASC but read from back 
		Arrays.sort(a);

		System.out.println();
		System.out.println("Array Elements After Sorting:");
		for(i=n-1;i>=0;i--)
			System.out.print(a[i]+" ");
    }
}
