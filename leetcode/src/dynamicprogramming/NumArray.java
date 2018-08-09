package dynamicprogramming;

/**
 * <Problem 303> Given an integer array nums, find the sum of the elements
 * between indices i and j (i ≤ j), inclusive.
 * 
 * Example: Given nums = [-2, 0, 3, -5, 2, -1]
 * 
 * sumRange(0, 2) -> 1 sumRange(2, 5) -> -1 sumRange(0, 5) -> -3
 * 
 * @author nehashukla
 *
 */
public class NumArray {
	int[] sums;

	/**
	 * This constructor pre-calculates sum values in an array with the classical DP
	 * bottom-up approach.
	 * 
	 * @param nums
	 */
	public NumArray(int[] nums) {
		if (nums.length > 0) {
			sums = new int[nums.length];
			sums[0] = nums[0];
			for (int i = 1; i < nums.length; i++) {
				sums[i] = nums[i] + sums[i - 1];
			}
		}
	}

	/**
	 * Whenever this method is called with any range given by i to j, it calculates
	 * the value by simply finding the difference between sum[j] and sum[i]. If i is
	 * already 0, sum[j] is returned.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public int sumRange(int i, int j) {
		return i == 0 ? sums[j] : sums[j] - sums[i - 1];
	}

}
