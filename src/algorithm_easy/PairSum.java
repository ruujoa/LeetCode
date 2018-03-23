package algorithm_easy;

import java.util.Arrays;

public class PairSum {
	private static int pairSum(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 != 0) continue;
			sum += nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 4, 3, 2};
		System.out.println(pairSum(nums));
	}
}
