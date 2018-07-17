package arraysandstrings;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n
 * pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of
 * min(ai, bi) for all i from 1 to n as large as possible.
 * 
 * @author nehashukla
 *
 */
public class ArrayPartition {
	/**
	 * The sum of each minimum value in the pair will be maximum when the difference
	 * between each pair is minimum. This is possible when the array is already
	 * sorted.
	 * 
	 * @param nums
	 * @return
	 */
	public static int arrayPairSum(int[] nums) {
		// Can add a better sorting algorithm
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			sum = sum + nums[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 250, 3, -32 };
		int largestSum = arrayPairSum(nums);
		System.out.println(largestSum);
	}
}
