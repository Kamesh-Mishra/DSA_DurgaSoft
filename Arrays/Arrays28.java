package Arrays;

import java.util.Arrays;

//version2:
//---------
//we have predefined method is existed for arrays comaprision

//Arrays.equals(a,b);


public class Arrays28 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
		int b[] = {3,2,1};
		System.out.println(Arrays.equals(a,b));//false
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a,b));//true
    }
    
}
