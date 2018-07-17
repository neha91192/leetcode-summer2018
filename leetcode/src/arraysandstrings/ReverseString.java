package arraysandstrings;

/**
 * Write a function that takes a string as input and returns the string
 * reversed.
 * 
 * Example: Given s = "hello", return "olleh".
 * 
 * @author nehashukla
 *
 */
public class ReverseString {
	/**
	 * Two pointer technique: i starts from 0 and j starts from length-1, each
	 * element of the char array generated from string is reversed and when i>j, the
	 * reversed char array is generated back to the string and returned as a
	 * response.
	 * 
	 * @param s
	 * @return
	 */
	public static String reverseString(String s) {
		char[] stringArray = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			char temp = stringArray[i];
			stringArray[i] = stringArray[j];
			stringArray[j] = temp;

			i++;
			j--;
		}

		return new String(stringArray);
	}

	public static void main(String[] args) {
		String str = "hello";
		String reverseStr = reverseString(str);
		System.out.println(reverseStr);
	}
}
