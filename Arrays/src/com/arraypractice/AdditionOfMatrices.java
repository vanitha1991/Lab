package com.arraypractice;

public class AdditionOfMatrices {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{1,1,1},{1,1,1}};
		int sum[][]=new int[2][3];
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
 /* 0  1 2
0 1 2 3     1 1 1
1 4 5 6     1 1 1
 2 3 4
 5 6 7 */