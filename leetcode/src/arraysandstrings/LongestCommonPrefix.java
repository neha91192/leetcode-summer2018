package arraysandstrings;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example - Input: ["flower","flow","flight"] Output: "fl"
 * 
 * @author nehashukla
 *
 */
public class LongestCommonPrefix {
	/**
	 * indexOf method in String allows to find first occurrence of substring in a
	 * string. In this question, we want to maintain a longest common prefix
	 * variable (lcp) and so we need to check if first of all it is a prefix
	 * (indexOf should be 0). second is to reduce prefix length for each pair of
	 * strings(initializing with the value of first string in the array) if it is
	 * not the prefix at first place. This ensures that at the end the prefix is the
	 * longest and common between all the strings.
	 * 
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
		String lcp = "";
		if (strs.length > 0) {
			lcp = strs[0];
			for (int i = 1; i < strs.length; i++) {
				while (strs[i].indexOf(lcp) != 0) {
					lcp = lcp.substring(0, lcp.length() - 1);
				}
			}
		}

		return lcp;

	}

	public static void main(String[] args) {
		String[] strs = {};
		String prefix = longestCommonPrefix(strs);
		System.out.println(prefix);
	}
}
