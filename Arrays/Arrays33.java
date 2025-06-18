package Arrays;

import java.util.Arrays;

// case2: delete all elements in an array

public class Arrays33 {
    static int[] deleteAll(int a[]){
		int b[]=new int[0];
		return b;
	}

    public static void main(String[] args) {

        int a[] = {10,11,12,13,14,15};
		System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(deleteAll(a)));
    }
}
