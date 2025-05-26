package Arrays;

import java.util.Scanner;

//Program to read and write array elements.

public class Arrays1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = obj.nextInt();
        

		int i,a[] = new int[size];

		System.out.println("Enter "+size+" elements...");
		for(i=0;i<a.length;i++){
			a[i] = obj.nextInt();
		}

        obj.close();
        
		System.out.println("Array elements by using while loop..");
		int index=0;
		while(index<a.length)
		{
			System.out.println("index="+index+" a["+index+"]="+a[index]);
			index++;
		}

		System.out.println("Array elements by using for loop..");
		for(i=0;i<a.length;i++)
		{
			System.out.println("index="+i+" a["+i+"]="+a[i]);
		}

		System.out.println("Array elements by using for each loop..");
		for(int item:a)
		{
			System.out.println("item="+item);
		}

    }

}
