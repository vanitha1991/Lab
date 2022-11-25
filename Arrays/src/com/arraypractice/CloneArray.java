package com.arraypractice;

public class CloneArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		System.out.println("content of original array");
		for(int i:a)
		{
			System.out.println(i);
		}
	    int ca[]=a.clone();
	    System.out.println("content of cloned array");
	    for(int i:ca)
	    {
	    	System.out.println(i);
	    }

	}

}
