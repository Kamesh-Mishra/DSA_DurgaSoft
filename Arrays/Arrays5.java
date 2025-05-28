package Arrays;

import java.util.Scanner;


//Program to replace old element with new element
//-----------------------------------------------

//version1: update all occurrences

public class Arrays5 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = obj.nextInt();

		int i,a[] = new int[size];

		System.out.println("Enter "+size+" elements...");
		for(i=0;i<a.length;i++){
			a[i] = obj.nextInt();
		}

		System.out.println("Array Elements Before update...");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();

		//version1 : update all occurences
        
		int olde,newe;
		System.out.println("Enter old element");
		olde=obj.nextInt();
		System.out.println("Enter new element");
		newe=obj.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(olde==a[i]){
				a[i]=newe;
			}
		}
		
		
		System.out.println("Array Elements After update all occurences...");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
    }
}
