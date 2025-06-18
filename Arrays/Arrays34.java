package Arrays;

import java.util.Arrays;

public class Arrays34 {
    

        static int[] deleteElement(int[] a, int element){
            int index = -1, i,k=0;
            for(i=0;i<a.length;i++){
                if(a[i]==element){
                    index = i;
                    break;
                }
            }
            if(index!=-1){
                int[] b=new int[a.length-1];
                for(i=0;i<a.length;i++){
                    if(i==index)
                        continue;
                    b[k++]=a[i];
                }
                return b;
            }
            return a;
            }
        


    public static void main(String[] args) {
        
        int a[] = {10,11,12,13,14,15};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(deleteElement(a,10)));
		System.out.println(Arrays.toString(deleteElement(a,11)));
		System.out.println(Arrays.toString(deleteElement(a,12)));
		System.out.println(Arrays.toString(deleteElement(a,13)));
		System.out.println(Arrays.toString(deleteElement(a,14)));
		System.out.println(Arrays.toString(deleteElement(a,15)));

    }
}
