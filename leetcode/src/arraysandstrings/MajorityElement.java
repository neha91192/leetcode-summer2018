package arraysandstrings;

/**
 * <Problem 169> Given an array of size n, find the majority element. The
 * majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1: Input: [3,2,3] Output: 3 Example 2: Input: [2,2,1,1,1,2,2] Output:
 * 2
 * 
 * @author nehashukla
 *
 */
public class MajorityElement {
	/**
	 * To do this, we maintain a count, which is incremented whenever we see an
	 * instance of our current candidate for majority element and decremented
	 * whenever we see anything else. Whenever count equals 0, we effectively forget
	 * about everything in nums up to the current index and consider the current
	 * number as the candidate for majority element.
	 * 
	 * If the current candidate is actually the candidate, it will appear once again
	 * to increment the count otherwise there won't be any other majority element
	 * which will decrement the current majority element candidate count.
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		int count = 0;
		int candidate = nums[0];

		for (int number : nums) {
			if (number == candidate) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				candidate = number;
				count++;
			}
		}
		return candidate;
	}
}
