package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//toString(arrayname)  method

public class Arrays25 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = obj.nextInt();

		int i,a[]=new int[n];

		System.out.println("Enter "+n+" values:");
		for(i=0;i<n;i++)
			a[i] = obj.nextInt();

		
		System.out.println("Array Elements one-by-one...");
		for(i=0;i<n;i++)
			System.out.println(i+"===>"+a[i]);

		System.out.println(Arrays.toString(a));
    }
    
}
