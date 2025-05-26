package Arrays;

import java.util.Scanner;

//Program to calcualte sum of elements present in an array.

public class Arrays2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = obj.nextInt();

		int sum=0,i,a[] = new int[size];

		System.out.println("Enter "+size+" elements...");
		for(i=0;i<a.length;i++){
			a[i] = obj.nextInt();
		}

        obj.close();

		sum=0;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
    }
}
