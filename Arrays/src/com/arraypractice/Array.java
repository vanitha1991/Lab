package com.arraypractice;

public class Array {

	public static void main(String[] args) {
		int[] a={100,200,300,400};
		int []b=new int[] {1,2,3};
		int c[]=new int[4];
		c[0]=10;
		c[1]=20;
		c[2]=30;
		c[3]=40;
		System.out.println("using  for loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println( "using for-each loop");
		for(int j:b) {
			System.out.println(j);
		}
		System.out.println( "using for-each loop");
		for(int k:c) {
			System.out.println(k);
		}
	}

}
