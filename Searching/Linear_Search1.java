package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search1 {
    static int linearSearch(int a[],int key){
		int i,index=-1;
		for(i=0;i<a.length;i++){
			if(key==a[i])
			{
				index=i;
				break;
			}
		}
		return index;
	}

    public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int[] a = {10, 11, 12, 13, 11, 12, 11, 8, 19, 11};
		System.out.println("Array="+Arrays.toString(a));
		System.out.println("Enter key element to search:");
		int key = obj.nextInt();
        obj.close();
		System.out.println(linearSearch(a,key));
	}



}
