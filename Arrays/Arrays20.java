package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//binary search using recursion

public class Arrays20 {

    static int binarySearch(int[] a, int l, int h, int key){
        if(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]<key)
                return binarySearch(a, mid+1, h, key);
            else
                return binarySearch(a, l, mid-1, key);
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

		System.out.println("Enter the value to search:");
		int key = obj.nextInt();
		obj.close();
		Arrays.sort(a);

		System.out.println(binarySearch(a,0,a.length-1,key));
    }
}
