package Sorting;

import java.util.Arrays;

public class Bubble_Sort2 {
    static void bubbleSortDesc(int a[])
	{
		int i,j,t;
		for(i=0;i<a.length-1;i++)
		{
			//bubble sort
			for(j=0;j<a.length-i-1;j++)
			{
				if(a[j] < a[j+1])
				{
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}

    public static void main(String[] args) {
        int a[] = {1,9,3,8,7,5,2,4};
		System.out.println("before sorting=====>"+Arrays.toString(a));
		bubbleSortDesc(a);
		System.out.println("after sorting desc=>"+Arrays.toString(a));
    }
}
