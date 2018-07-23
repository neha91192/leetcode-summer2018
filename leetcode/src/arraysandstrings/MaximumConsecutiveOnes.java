package arraysandstrings;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array. Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or
 * the last three digits are consecutive 1s. The maximum number of consecutive
 * 1s is 3.
 * 
 * @author nehashukla
 *
 */
public class MaximumConsecutiveOnes {
	/**
	 * This problem is solved using two pointers -> counter: stores the count of
	 * '1's encountered starting from resetCounter. resetCounter: gets the value of
	 * ith index in case the value is not '1'. Therefore at each iteration, counter
	 * is updated with the value i-resetCounter if values encountered are '1' with
	 * the increment of i.
	 * 
	 * @param nums
	 * @return
	 */
	public int findMaxConsecutiveOnes(int[] nums) {
		int resetCounter = -1, counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1) {
				resetCounter = i;
			}
			counter = (counter > i - resetCounter) ? counter : i - resetCounter;
		}
		return counter;
	}
}
