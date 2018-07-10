package arraysandstrings;

/**
 * <Problem 28> Return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack. Example 1: Input: haystack =
 * "hello", needle = "ll" Output: 2. Example 2: Input: haystack = "aaaaa",
 * needle = "bba" Output: -1. Return 0 when needle is an empty string
 * 
 * @author nehashukla
 *
 */
public class StrStr {
	/**
	 * Simpler implementation in Java could be to just return
	 * haystack.indexOf(needle) value which has runtime of 0ms.
	 * 
	 * Another way of implementation could be given as follows (first intuition).
	 * Check each substring value in haystack for a given needle value. If the
	 * substring matches, it returns starting index i of haystack otherwise ends if
	 * there is no more substring possible.
	 * 
	 * <Runtime 4ms>
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public static int strStr(String haystack, String needle) {
		int i = 0;
		if (!needle.isEmpty() && !haystack.equals(needle)) {
			while (i <= (haystack.length() - needle.length())) {
				if (haystack.substring(i, i + needle.length()).equals(needle)) {
					return i;
				}
				i++;
			}
			return -1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "o";
		int index = strStr(haystack, needle);
		System.out.println(index);
	}
}
