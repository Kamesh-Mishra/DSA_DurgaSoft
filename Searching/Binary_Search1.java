package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search1 {
    static int binarySearch(int a[],int key){
		int l=0,h=a.length-1,mid;
		while(l<=h){
			mid=(l+h)/2;
			if(a[mid]==key)
				return mid;
			else if(key<a[mid])
				h=mid-1;
			else
				l=mid+1;
		}
		return -1;
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
		System.out.println(binarySearch(a,key));
	}
}
