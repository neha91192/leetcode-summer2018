package dynamicprogramming;

/**
 * <Problem 746> On a staircase, the i-th step has some non-negative cost
 * cost[i] assigned (0 indexed).
 * 
 * Once you pay the cost, you can either climb one or two steps. You need to
 * find minimum cost to reach the top of the floor, and you can either start
 * from the step with index 0, or the step with index 1.
 * 
 * Example1: Input: cost = [10, 15, 20] Output: 15 Explanation: Cheapest is
 * start on cost[1], pay that cost and go to the top.
 * 
 * Example2: Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1] Output: 6
 * Explanation: Cheapest is start on cost[0], and only step on 1s, skipping
 * cost[3].
 * 
 * @author nehashukla
 *
 */
public class MinCostClimbingStairs {
	/**
	 * 
	 * @param cost
	 * @return
	 */
	public static int minCostClimbingStairs(int[] cost) {
		int[] minCost = new int[cost.length + 1];
		minCost[0] = cost[0];
		minCost[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			minCost[i] = cost[i] + Math.min(minCost[i - 1], minCost[i - 2]);
		}
		return Math.min(minCost[cost.length - 1], minCost[cost.length - 2]);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 100 };
		int minCost = minCostClimbingStairs(nums);
		System.out.println(minCost);

	}
}
