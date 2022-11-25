package com.arraypractice;

public class EnchancedForExample {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int sum=0;
	System.out.println("elements of array are ");
	for(int i:a)
	{
		
		System.out.println(i);
		sum=sum+i;
		
	}
	System.out.println("sum of array elemnets is "+sum);

	}

}
