package arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * <Problem 1> Given an array of integers, return indices of the two numbers
 * such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * @author nehashukla
 *
 */
public class TwoSum {
	/**
	 * Runs in O(N) but requires an extra map storage. Stores number as and its
	 * index value as value of the hashmap. In the second for loop, it checks if
	 * target-{each number} in the array matches with any of the hashmap entries. If
	 * it does then returning index would be current index and the value stored in
	 * the hashmap
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> indexMap = new HashMap<>();
		int[] resultArray = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (!indexMap.containsKey(nums[i])) {
				indexMap.put(nums[i], i);
			}

		}
		for (int j = 0; j < nums.length; j++) {
			int i = target - nums[j];
			if (indexMap.containsKey(i) && indexMap.get(i) != j) {
				resultArray[0] = indexMap.get(i);
				resultArray[1] = j;
			}
		}
		return resultArray;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
