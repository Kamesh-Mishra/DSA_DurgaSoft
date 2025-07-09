package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search2 {
    
    static int binarySearch(int a[],int key,int l,int h){
		int mid=(l+h)/2;
		if(l>h)
			return -1;
		if(key==a[mid])
			return mid;
		else if(key<a[mid])
			return binarySearch(a,key,l,mid-1);
		else
			return binarySearch(a,key,mid+1,h);
	}

    public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int[] a = {10, 34, 23, 22, 56, 65, 77, 78, 87, 99};
		Arrays.sort(a);
		System.out.println("Array="+Arrays.toString(a));
		System.out.println("Enter key element to search:");
		int key = obj.nextInt();
        obj.close();
		System.out.println(binarySearch(a,key,0,a.length-1));
	}
}
