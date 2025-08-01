package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Binary Search Version4
//----------------------
//I want to search for element in the second half of the list i.e. n/2+1 to n.

public class Arrays22 {
    
    static int binarysearch(int a[],int l,int h,int key){
		if(l<=h){
			int mid=(l+h)/2;
			if(a[mid]==key)
				return mid;
			else if(a[mid]<key)
				return binarysearch(a,mid+1,h,key);
			else
				return binarysearch(a,l,mid-1,key);
		}
		return -1;
	}
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = obj.nextInt();

		int i,a[]=new int[n];

		System.out.println("Enter "+n+" values:");
		for(i=0;i<n;i++)
			a[i] = obj.nextInt();

		
		
		Arrays.sort(a);

		System.out.println("Array Elements after sorting...");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();

		System.out.println("Enter the value to search:");
		int key = obj.nextInt();
		
		System.out.println(binarysearch(a,(a.length-1)/2,a.length,key));
    }
}
