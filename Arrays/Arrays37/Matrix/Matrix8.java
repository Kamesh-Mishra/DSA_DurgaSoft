package Arrays.Arrays37.Matrix;

import java.util.Scanner;

// 10) Program to check whether the given matrix is identity matrix or not?

/* 

diagonal elements should be '1'
		non-diagonal elements should be '0'

		1 0 0
		0 1 0
		0 0 1

*/
public class Matrix8 {
    
    static boolean isIdentity(int a[][],int n,int m)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(i!=j && a[i][j]!=0)
					return false;
				if(i==j && a[i][j]!=1)
					return false;
			}
		}
		return true;
	}
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter matrix row size:");
		int rsize = obj.nextInt();

		System.out.println("Enter matrix column size:");
		int csize = obj.nextInt();


		int i,j;
		int a[][] = new int[rsize][csize];

		System.out.println("Enter matrix element one-by-one:");
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
				a[i][j] = obj.nextInt();
			}
		}

		System.out.println(isIdentity(a,rsize,csize));
    }
}
