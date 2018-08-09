package dynamicprogramming;

/**
 * <Problem 198>You are a professional robber planning to rob houses along a
 * street. Each house has a certain amount of money stashed, the only constraint
 * stopping you from robbing each of them is that adjacent houses have security
 * system connected and it will automatically contact the police if two adjacent
 * houses were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * Example: Input: [1,2,3,1] Output: 4 Explanation: Rob house 1 (money = 1) and
 * then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
 * 
 * @author nehashukla
 *
 */
public class HouseRobber {
	/**
	 * This problem is similar to knapsack where maximizing the value depends on
	 * whether you are choosing current item with the previously selected values
	 * (n-2) since adjacent house/item cannot be chosen or you are not selecting
	 * current item but staying only with the previous value (n-1).
	 * 
	 * @param nums
	 * @return
	 */
	public static int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}

		int[] money = new int[nums.length];
		money[0] = nums[0];
		money[1] = Math.max(nums[0], nums[1]);

		for (int i = 2; i < nums.length; i++) {
			money[i] = Math.max(money[i - 2] + nums[i], money[i - 1]);
		}

		return money[nums.length - 1];

	}

	public static void main(String[] args) {
		int[] nums = { 7, 18, 5 };
		int maxProfit = rob(nums);
		System.out.println(maxProfit);
	}
}
