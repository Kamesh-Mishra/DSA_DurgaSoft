package Arrays;

import java.util.Scanner;

// Program to find max and min element present in an array

public class Arrays4 {

   static int min(int a[]){
        int min = a[0];
        for (int i : a)
            if(min> i)
                min = i;
        return min;
   }
   
   static int max(int a[]){
        int max = a[0];
        for (int i : a)
            if(max< i)
                max = i;
        return max;
   }

   public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter "+size+" elements...");
		for(int i=0;i<a.length;i++){
			a[i] = obj.nextInt();
		}
        obj.close();

        System.out.println("Min of elements is :"+ min(a));
        
        System.out.println("Max of elements is :"+ max(a));
   }
}