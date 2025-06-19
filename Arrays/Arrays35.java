package Arrays;

import java.util.Arrays;

//UPDATING ELEMENT IN AN ARRAY
//----------------------------

// case1: updating based on location

public class Arrays35 {
    static int[] updateElementAtLocation(int a[],int location,int element){
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++)
            b[i]=a[i];
        if(location>=0 && location<a.length)
            b[location]=element;
        return b;
    }

    public static void main(String[] args) {
        int a[] = {10,11,12,13,14,15};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(updateElementAtLocation(a,0,999)));
		System.out.println(Arrays.toString(updateElementAtLocation(a,1,999)));
		System.out.println(Arrays.toString(updateElementAtLocation(a,2,999)));
		System.out.println(Arrays.toString(updateElementAtLocation(a,3,999)));
		System.out.println(Arrays.toString(updateElementAtLocation(a,4,999)));
		System.out.println(Arrays.toString(updateElementAtLocation(a,5,999)));
		System.out.println(Arrays.toString(updateElementAtLocation(a,7,999)));
    }
}
