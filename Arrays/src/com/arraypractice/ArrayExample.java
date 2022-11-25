package com.arraypractice;

public class ArrayExample {
	static void add(int arr[])
	{ 
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array elements is"+sum);
	}
	static int[]  inputForArray()
	{
		return new int[] {20,10};
	}

	public static void main(String[] args) {
		int a[]= {10,20};
		int b[]=inputForArray();
		for(int j=0;j<b.length;j++)
		{
			System.out.println("elemnents of array b are "+b[j]);
		}
		//int a[]=new int[1];
		//a[0]=10;
		//a[1]=20;
		add(a);
	}

}
