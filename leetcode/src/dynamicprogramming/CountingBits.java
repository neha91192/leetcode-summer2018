package dynamicprogramming;

/**
 * <Problem 338> Given a non negative integer number num. For every numbers i in
 * the range 0 ≤ i ≤ num calculate the number of 1's in their binary
 * representation and return them as an array.
 * 
 * Example: Input: 2 Output: [0,1,1]
 * 
 * @author nehashukla
 *
 */
public class CountingBits {
	/**
	 * This is bottom up technique where counting number of values require the
	 * knowledge of previously calculated bit values. If n is any power of two, the
	 * value will always be 1. Otherwise, it will be value calculated for the latest
	 * power of 2 + (n-latest power of 2) i.e., C[n] = C[n/2] + n%2
	 * 
	 * @param num
	 * @return
	 */
	public int[] countBits(int num) {
		int[] sol = new int[num + 1];
		sol[0] = 0;
		if (num == 0) {
			return sol;
		}
		sol[1] = 1;
		for (int i = 2; i <= num; i++) {
			sol[i] = sol[i / 2] + i % 2;
		}
		return sol;
	}
}
