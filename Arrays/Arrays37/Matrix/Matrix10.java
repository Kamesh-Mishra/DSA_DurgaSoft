package Arrays.Arrays37.Matrix;

import java.util.Scanner;

/* 
12) Swaping of two cols
~~~~~~~~~~~~~~~~~~~~~~~
Ex:
---
	1 2 3
	4 5 6
	7 8 9

	1st and 3rd col

	3 2 1
	6 5 4
	9 8 7

*/

public class Matrix10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter row value:");
		int row = obj.nextInt();

		System.out.println("Enter col value:");
		int col = obj.nextInt();

		int a[][] = new int[row][col];

		int i,j,n,m,t;

		System.out.println("Enter matrix elements:");

		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				a[i][j] = obj.nextInt();
			}
		}

		System.out.println("Enter m and n values:");
		m=obj.nextInt();
		n=obj.nextInt();

		System.out.println("Before swaping:");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		for(i=0;i<col;i++){
			t=a[i][m-1];
			a[i][m-1]=a[i][n-1];
			a[i][n-1]=t;
		}

		System.out.println("After swaping:");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
    }
}
