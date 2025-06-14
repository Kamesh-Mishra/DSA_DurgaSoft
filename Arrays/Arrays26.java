package Arrays;


//equality of two arrays:
//~~~~~~~~~~~~~~~~~~~~~~~
//two arrays are said to equal iff each element present in the first 
//    array must be existed in the second also with same positions.

//version1:
 
// camparision with respect to position

public class Arrays26 {
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
    }
}
