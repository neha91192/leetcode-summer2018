package dynamicprogramming;

/**
 * <Problem 121> Say you have an array for which the ith element is the price of
 * a given stock on day i.
 * 
 * If you were only permitted to complete at most one transaction (i.e., buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * Note that you cannot sell a stock before you buy one.
 * 
 * Example: Input: [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1)
 * and sell on day 5 (price = 6), profit = 6-1 = 5. Not 7-1 = 6, as selling
 * price needs to be larger than buying price.
 * 
 * @author nehashukla
 *
 */
public class BuyAndSell {
	/**
	 * In this technique, prices are already given in the input array, just that to
	 * calculate maximum profit, a temp storage is maintained which increments
	 * maxProfit value only when it is greater than 0.Intuition is just like having
	 * a hike alert (when prices are positive, i.e sum profit) and storing that
	 * alert (updating temp, which updates the maxProfit whenever it is greater than
	 * 0).
	 * 
	 * @param prices
	 * @return
	 */
	public static int maxProfit(int[] prices) {
		int temp = 0;
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			temp = temp + prices[i] - prices[i - 1];
			if (temp < 0) {
				temp = 0;
			}
			if (temp > maxProfit) {
				maxProfit = temp;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] nums = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = maxProfit(nums);
		System.out.println(maxProfit);
	}
}
