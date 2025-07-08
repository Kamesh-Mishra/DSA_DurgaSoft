package Arrays.Arrays37.Matrix;

import java.util.Scanner;

// 14) sum of opposite diagonal elements

public class Matrix12 {
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
			s=s+a[i][row-i-1];
		}
		System.out.println(s);
    }
}
