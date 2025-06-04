package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//version5: customized sorting

public class Arrays14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int i,n = obj.nextInt();

		int a[] = new int[n];
		System.out.println("Enter "+n+" elements.");
		for(i=0;i<n;i++)
			a[i] = obj.nextInt();

        obj.close();
		System.out.println("Array Elements Before Sorting:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");

		//version5==> by using customized sorting
		//start and ending location
		Arrays.sort(a,0,n/2);

		System.out.println();
		System.out.println("Array Elements After Sorting:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");



        /*
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

		//version5==> by using customized sorting
		//start and ending location
		Arrays.sort(a,n/2,n);

		System.out.println();
		System.out.println("Array Elements After Sorting:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" "); 
         */
    }
}
