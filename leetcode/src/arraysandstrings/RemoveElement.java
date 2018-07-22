package arraysandstrings;

/**
 * <Problem 27> Given an array nums and a value val, remove all instances of
 * that value in-place and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * Given nums = [3,2,2,3], val = 3,
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 2.
 * 
 * It doesn't matter what you leave beyond the returned length.
 * 
 * @author nehashukla
 *
 */
public class RemoveElement {
	/**
	 * Pointer i starts from 0 and j from length-1. If any number at ith index
	 * matches with the val, it is swapped with element at j only if element at j is
	 * not a val. For either of these cases, count is maintained and therefore when
	 * all required elements are shifted to left of the array, the required length
	 * is returned.
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement(int[] nums, int val) {
		int i = 0;
		int j = nums.length - 1;
		int count = 0;

		while (i < j) {
			if (nums[i] == val) {
				if (nums[j] != val) {
					nums[i] = nums[j];
					i++;
				}
				j--;
				count++;
			} else {
				i++;
			}
		}
		if (i == j && nums[i] == val) {
			count++;
		}
		return nums.length - count;
	}
}
