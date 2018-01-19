package com.project.euler;

public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumSquareDifference sqd=new SumSquareDifference();
		int diff=sqd.squareOfSum(100)-sqd.sumOfSquares(100);
		System.out.println(diff);
	}

	// sum of square of first 100 natural numbers

	public int sumOfSquares(int n) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}

	public int squareOfSum(int n) {
		int sum = 0;
		sum = (n * (n + 1)) / 2;
		return(int) Math.pow(sum, 2);
	}
}
