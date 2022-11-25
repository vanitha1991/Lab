package com.arraypractice;

public class VarargsExample1 {
	/*static void display1(int b,int... a)
	{
		System.out.println("number of argumnets is "+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//for each loop
		for(int i:a)
		{
			System.out.println(i);
			
		}
	}*/

	static void display2(String s,int... a)
	{
		System.out.println("number of argumnets is "+a.length);
		
		for(int i:a)
		{
			System.out.println(i);
			
		}
	}
	

	public static void main(String[] args) {
		//display1(1);
		//display1(100,200);
		//display1(1,2,3,4);
		display2("ayesha",88,99);
		display2("shabishta",11,12,13,14,15,16);
		display2("shoeb");
		

	}

}
