package Arrays.Arrays37.Matrix;

import java.util.Scanner;

/*
 13) sum of diagonal elements
~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Ex:
---
		1 2 3
		4 5 6
		7 8 9

		1,5,9 ---> 1+5+9=15
 */


public class Matrix11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter row value:");
		int row = obj.nextInt();

		System.out.println("Enter col value:");
		int col = obj.nextInt();

		int a[][] = new int[row][col];

		int i,j,s;

		System.out.println("Enter matrix elements:");

		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				a[i][j] = obj.nextInt();
			}
		}

        System.out.println("Matrix Elements :");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		s=0;
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(i==j)
				{
					s=s+a[i][j];
				}
			}
		}
		System.out.println("Diagonal sum = "+s);
    }
}
