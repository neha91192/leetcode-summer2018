package dynamicprogramming;

/**
 * <Problem 70>You are climbing a stair case. It takes n steps to reach to the
 * top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * Note: Given n will be a positive integer. Example: Input: 3 Output: 3
 * Explanation: There are three ways to climb to the top. 1. 1 step + 1 step + 1
 * step 2. 1 step + 2 steps 3. 2 steps + 1 step
 * 
 * @author nehashukla
 *
 */
public class ClimbingStairs {
	/**
	 * This is just like Fibonacci problem where deciding the number of ways for n
	 * requires total number of ways of n-1 steps + n-2 steps.
	 * 
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		int[] sol = new int[n + 1];
		sol[0] = 1;
		sol[1] = 2;
		for (int i = 2; i < n; i++) {
			sol[i] = sol[i - 2] + sol[i - 1];
		}

		return sol[n - 1];
	}

	public int climbStairsFibo(int n) {
		if (n == 1)
			return 1;

		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;

		}

		return second;
	}
}
