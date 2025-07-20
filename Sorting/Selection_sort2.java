package Sorting;

import java.util.Arrays;

public class Selection_sort2 {
    static void selectionSortDesc(int a[])
	{
		int i,j,min,temp,n=a.length;

		for(i=0;i<n-1;i++)
		{
			min = i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]>a[min])
				{
					min = j;
				}
			}
			if(min!=i)
			{
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}

    public static void main(String[] args) {
        int a[] = {1,9,3,8,7,5,2,4};
		System.out.println("before sorting=====>"+Arrays.toString(a));
		selectionSortDesc(a);
		System.out.println("after sorting desc=>"+Arrays.toString(a));
    }
}
