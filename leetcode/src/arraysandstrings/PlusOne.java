package arraysandstrings;

/**
 * <Problem 66> Given a non-empty array of digits representing a non-negative
 * integer, plus one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * @author nehashukla
 *
 */
public class PlusOne {
	/**
	 * This is a naive solution (but no poor runtime, goes O(n) in worstcase).
	 * 
	 * 
	 * First it checks if the last digit is 9, if it isn't (1,2,3) then the
	 * algorithm directly returns by adding 1 to the last element of the array. If
	 * the last digit is 9 (1,2,9), it starts a loop and make all the 9's as 0. The
	 * while loop stops at 0th index (or before if no further 9 is encountered in
	 * sequence) where it checks if the final number is also 9. If it is not 9, it
	 * increments the value of the first element by 1, otherwise, initialize a new
	 * integer array with size as digits.length+1 with values as 1 in the starting
	 * index and 0 in remaining indices.
	 * 
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
		int i = 0;
		i = digits.length - 1;
		int[] returnDigits = null;

		if (digits[i] != 9) {
			digits[i] = digits[i] + 1;
		} else {
			while (digits[i] == 9 && i > 0) {
				digits[i] = 0;
				i--;
			}
			if (digits[i] != 9) {
				digits[i] = digits[i] + 1;
			} else {
				returnDigits = new int[digits.length + 1];
				returnDigits[0] = 1;
				for (int j = 1; j < returnDigits.length; j++) {
					returnDigits[j] = 0;
				}
				return returnDigits;
			}

		}

		return digits;
	}
}
