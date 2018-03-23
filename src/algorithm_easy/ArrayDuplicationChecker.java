package algorithm_easy;

import java.util.Arrays;

public class ArrayDuplicationChecker {
	private static boolean isDuplicated(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i-1]) return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {7, 2, 3, 2, 4, 6, 8};
		System.out.println(isDuplicated(nums1));
		int[] nums2 = {7, 1, 3, 2, 4, 6, 8};
		System.out.println(isDuplicated(nums2));
	}
}
