package arraysandstrings;

/**
 * <Problem 747> In a given integer array nums, there is always exactly one
 * largest element. Find whether the largest element in the array is at least
 * twice as much as every other number in the array. If it is, return the index
 * of the largest element, otherwise return -1.
 * 
 * Link ->
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
 */

public class DominantIndex {
	/**
	 * Solution iterates over the list and finds the max, secondMax and candidate
	 * dominant index of the array. At the end of the iteration, it checks if the
	 * condition of dominant index (i.e., at least twice as much as other number)
	 * satisfies. If yes, it returns that dominant index, otherwise returns -1.
	 * 
	 * <runtime 10ms>
	 * 
	 * @param nums
	 * @return integer representing dominant index
	 */
	public int dominantIndex(int[] nums) {
		int max = -1;
		int secondMax = -1;
		int dominantIndex = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				secondMax = max;
				max = nums[i];
				dominantIndex = i;
			}
			if (nums[i] > secondMax && nums[i] < max) {
				secondMax = nums[i];
			}
		}
		if (max >= 2 * secondMax) {
			return dominantIndex;
		} else {
			return -1;
		}
	}
}
