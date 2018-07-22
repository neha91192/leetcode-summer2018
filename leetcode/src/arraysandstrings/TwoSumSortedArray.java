package arraysandstrings;

/**
 * <Problem 47> Given an array of integers that is already sorted in ascending
 * order, find two numbers such that they add up to a specific target number.
 * 
 * Example: Input: numbers = [2,7,11,15], target = 9 Output: [1,2] Explanation:
 * The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 * 
 * @author nehashukla
 *
 */
public class TwoSumSortedArray {
	/**
	 * pointer i starts from 0th index and j from the max length. If sum of numbers
	 * and ith index and jth index is equal to the target, solution is found. Else
	 * if it is greater than the target, j is decremented otherwise i.
	 * 
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;

		int[] solutionArray = new int[2];

		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				solutionArray[0] = i + 1;
				solutionArray[1] = j + 1;
				break;
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				j--;
			}
		}

		return solutionArray;
	}
}
