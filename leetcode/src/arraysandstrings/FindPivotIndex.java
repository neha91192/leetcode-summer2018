package arraysandstrings;

public class FindPivotIndex {
	/**
	 * Calculate total sum. Then for each candidate pivotal index in nums, calculate
	 * left side sum (sum of every values at the left of candidate pivotal index)
	 * and right side sum (sum of every values at the right of candidate pivotal
	 * index). If rightsum matches with the leftsum, then that candidate pivotal
	 * index is the answer of this problem.
	 * 
	 * <runtime 20ms>
	 * 
	 * @param nums
	 * @return integer representing pivotal index
	 */
	public static int pivotIndex(int[] nums) {
		int sum = 0;
		int leftSum = 0;
		int rightSum = 0;

		// calculate sum
		for (int val : nums) {
			sum = sum + val;
		}
		for (int i = 0; i < nums.length; i++) {
			rightSum = sum - leftSum - nums[i];
			if (leftSum == rightSum) {
				return i;
			}
			leftSum = leftSum + nums[i];
		}

		return -1;

	}

	public static void main(String[] args) {
		// sample test cases: {1, 2, 3}, {1, 3, 7, 6, 5, 6}, {-1, -1, -1, 0, 1, 1}
		int[] nums = new int[] { -1, -1, -1, -1, -1, 0 };
		int result = pivotIndex(nums);
		System.out.println(result);
	}
}
