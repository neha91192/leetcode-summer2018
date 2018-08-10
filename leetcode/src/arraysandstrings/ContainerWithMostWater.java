package arraysandstrings;

/**
 * <Problem 11>Given n non-negative integers a1, a2, ..., an , where each
 * represents a point at coordinate (i, ai). n vertical lines are drawn such
 * that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such that the container
 * contains the most water.
 * 
 * Note: You may not slant the container and n is at least 2.
 * 
 * Input: [1,8,6,2,5,4,8,3,7] Output: 49
 * 
 * @author nehashukla
 *
 */
public class ContainerWithMostWater {
	/**
	 * Using two pointer technique, start i at index 0 and j at length-1. Idea is to
	 * get maxarea which can be calculated using Minof(values at i,j) * distance of
	 * i,j.
	 * 
	 * The intuition behind this approach is that the area formed between the lines
	 * will always be limited by the height of the shorter line. Further, the
	 * farther the lines, the more will be the area obtained.
	 * 
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int maxValue = 0;
		int i = 0;
		int j = height.length - 1;
		while (i < j) {
			int p = height[i];
			int q = height[j];
			int val = (j - i) * Math.min(p, q);
			if (val > maxValue) {
				maxValue = val;
			}
			if (p < q) {
				i++;
			} else {
				j--;
			}
		}
		return maxValue;
	}
}
