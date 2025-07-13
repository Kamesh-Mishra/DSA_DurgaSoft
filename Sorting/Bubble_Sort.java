package Sorting;

import java.util.Arrays;

// Sorting:-
// ~~~~~~~~

// Arranging the data in asc order or desc order is called as sorting.
//     there various sorting tech are existed.

// bubble sort:


public class Bubble_Sort {
    static void bubbleSortAsc(int a[]){
        int i,j,t;
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
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
    bubbleSortAsc(a);
    System.out.println("after sorting asc==>"+Arrays.toString(a));
    
    }
}
