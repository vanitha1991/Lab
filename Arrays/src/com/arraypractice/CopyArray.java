package com.arraypractice;

public class CopyArray {

	public static void main(String[] args) {
		char[] a= {'h','a','i','j','a','v','a'};
		char[] b=new char[7];
		System.arraycopy(a,0,b,0,7);
		System.out.println(String.valueOf(b));

	}

}
