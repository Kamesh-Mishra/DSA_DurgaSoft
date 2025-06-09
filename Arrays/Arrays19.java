package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//binary search:
//~~~~~~~~~~~~~~

// Here first we have to sort the elements in asc order, then compare
//     key element with middle elements if result found then return
//      the result else we can compare either in left part or right part.

public class Arrays19 {

    static int binarySearch(int a[], int key){
        int l=0,h=a.length-1,mid;
        while (l<=h) {
            mid=(l+h)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]<key)
                l=mid+1;
            else
                h=mid-1;
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
        System.out.println("array after sort : ");
        for(int k : a)
            System.out.print(k+" ");  
        System.out.println();  
		System.out.println("Enter the value to search:");
		int key = obj.nextInt();
        obj.close();
		
		
		System.out.println(binarySearch(a,key));
    }
}
