package arraysandstrings;

/**
 * <Problem 283> Given an array nums, write a function to move all 0's to the
 * end of it while maintaining the relative order of the non-zero elements.
 * 
 * Example: Input: [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * Note: You must do this in-place without making a copy of the array. Minimize
 * the total number of operations.
 * 
 * @author nehashukla
 *
 */
public class MoveZeros {
	/**
	 * If a number needs to be swapped (i.e it is 0 and the next number is non zero,
	 * it will swap and increments both the count. Otherwise only j will be
	 * incremented.
	 * 
	 * @param nums
	 */
	public void moveZeroes(int[] nums) {
		int i = 0;
		int j = 1;
		while (i < nums.length && j < nums.length) {
			if (nums[i] == 0) {
				if (nums[j] != 0) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					i++;
				}
				j++;
			} else {
				i++;
				j++;
			}
		}
	}

	/**
	 * Shifts array to left by number of 0s encountered and places that many 0s at
	 * the end.
	 * 
	 * @param nums
	 */
	public void moveZeroes1(int[] nums) {
		int zeros = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[zeros++] = nums[i];
			}
		}

		for (; zeros < nums.length; zeros++) {
			nums[zeros] = 0;
		}
	}
}
