package Arrays;

import java.util.Arrays;

//version1:
 
// camparision after sorting array, ignoring position
public class Arrays27 {
    static boolean equals(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}

    public static void main(String[] args) {
        	System.out.println(equals(new int[]{1,2,3},new int[]{1,2,3}));//true
		System.out.println(equals(new int[]{1,2,3},new int[]{4,5,6}));//false
		System.out.println(equals(new int[]{1,2,3},new int[]{3,2,1}));//false
		int a[] = {1,2,3};
		int b[] = {3,2,1};
		System.out.println(equals(a,b));//false
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(equals(a,b));//true
    }
}
