package Arrays;

import java.util.Arrays;

//case2: inserting an element at frist location

public class Arrays30 {
    
    static int[] insertAtFirst(int a[],int element)
	{
		int i,b[] = new int[a.length+1];
		b[0] = element;
		for(i=0;i<a.length;i++)
		{
			b[i+1] = a[i];
		}	
		return b;
	}
    
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(Demo.insertAtLast(a,60)));
		System.out.println(Arrays.toString(insertAtFirst(a,5)));
    }
}
