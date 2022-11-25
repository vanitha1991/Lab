package com.arraypractice;

public class Question {
	

		int eval(int[]...v) {

		int sum=0, b, c;

		for(b = 0; b<v.length; b++) {

		for(c=0;c<v[b].length; c++) {

		sum += v[b][c];

		}

		}

		return(sum);

		}

		public static void main(String args[]) {

		Question q = new Question();

		int sum =0;
							// 0  1  2  3              0  1  2
		sum = q.eval(new int[]{10,20,30,40}, new int[]{40,50,60});

		System.out.println("The sum of the numbers is:" + sum);

		}

		}


