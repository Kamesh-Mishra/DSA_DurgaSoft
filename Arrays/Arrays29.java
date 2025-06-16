package Arrays;

import java.util.Arrays;

// inserting an element into an array
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// case1: inserting an element into an array at last position

public class Arrays29 {
    
    static int[] insertAtLast(int a[], int element){
        int i,b[]=new int[a.length+1];
        for(i=0;i<a.length;i++){
            b[i]=a[i];
        }
        b[i] = element;
        return b;
    }

    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(insertAtLast(a,60)));
    }
}
