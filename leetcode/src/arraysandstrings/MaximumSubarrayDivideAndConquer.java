package arraysandstrings;

/**
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example: Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1]
 * has the largest sum = 6.
 * 
 * @author nehashukla
 *
 */
public class MaximumSubarrayDivideAndConquer {

	public static int maxSubArray(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int maxSum = findMaxSubArray(low, high, nums);
		return maxSum;
	}

	public static int findMaxSubArray(int low, int high, int[] nums) {
		if (high == low) {
			return nums[low];
		} else {
			int mid = (low + high) / 2;
			int leftSum = findMaxSubArray(low, mid, nums);
			int rightSum = findMaxSubArray(mid + 1, high, nums);
			int crossSum = findCrossSum(low, mid, high, nums);

			if (leftSum >= rightSum && leftSum >= crossSum) {
				return leftSum;
			} else {
				if (rightSum >= leftSum && rightSum >= crossSum) {
					return rightSum;
				} else {
					return crossSum;
				}
			}
		}
	}

	public static int findCrossSum(int low, int mid, int high, int[] nums) {
		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = mid; i >= 0; i--) {
			sum = sum + nums[i];
			if (sum > leftSum) {
				leftSum = sum;
			}
		}
		int rightSum = Integer.MIN_VALUE;
		for (int i = mid + 1; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum > rightSum) {
				rightSum = sum;
			}
		}

		return leftSum + rightSum;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int largestSum = maxSubArray(nums);
		System.out.println(largestSum);
	}

}
