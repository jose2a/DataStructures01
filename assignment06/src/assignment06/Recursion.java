package assignment06;

public class Recursion {

	/**
	 * PROBLEM 1: Adding two numbers using recursion.
	 * @param a
	 * @param b
	 * @return the sum of two numbers.
	 */
	public int sum(int a, int b) {
		if (b == 0)
			return a;
		return sum(a + 1, b - 1);
	}

	/**
	 * PROBLEM 2: Adding square numbers.
	 * @param n - a positive integer
	 * @return the sum of squares of first n numbers
	 */
	public int squareSum(int n) {
		if (n == 1)
			return 1;
		else
			return n * n + squareSum(n - 1);
	}

}
