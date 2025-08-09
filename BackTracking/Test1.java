package BackTracking;

import java.util.Arrays;

// backtracking a method by which a solution is found by
//  exahaustively searching through a large volume but 
//  finate number of state with some boundary condition.

// Types of backtracking problems:
// -------------------------------
// 1) Decision --------------------> Yes / No
// 2) Optimized Solution ----------> One sol
// 3) Enumerations (all sols) -----> all sols


// Backtracking with Arrays

public class Test1 {
    public static void changeArray(int[] a, int index, int value){
        if(index == a.length){    // base condition
            System.out.println(Arrays.toString(a));
            return;
        }
        a[index] = value;
        changeArray(a, index+1, value+1);   // recursion
        a[index] = a[index] - 2;   // backtracking
    }

    public static void main(String[] args){
        int[] a = new int[5];
        System.out.println(Arrays.toString(a));
        changeArray(a, 0, 1);
        System.out.println(Arrays.toString(a));
    }
}
