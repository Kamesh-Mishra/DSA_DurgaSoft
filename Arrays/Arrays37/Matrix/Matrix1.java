package Arrays.Arrays37.Matrix;

import java.util.Scanner;



//Implement a program to perform addition of two matrices

public class Matrix1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter matrix row size:");
		int rsize = obj.nextInt();

		System.out.println("Enter matrix column size:");
		int csize = obj.nextInt();

		int i,j,a[][] = new int[rsize][csize];

		System.out.println("Enter matrix element one-by-one:");
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
				a[i][j] = obj.nextInt();
			}
		}

		System.out.println("MATRIX ELEMENTS ARE:");
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
				System.out.print(a[i][j]+"["+i+","+j+"] ");
			}
			System.out.println();
    }
		}

}
