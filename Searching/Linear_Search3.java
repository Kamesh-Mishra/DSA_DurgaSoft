package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search3 {

    static ArrayList<Integer> linearSearch(int a[],int key){
		int i;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(i=0;i<a.length;i++){
			if(key==a[i])
				list.add(i);
		}
		return list;
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
