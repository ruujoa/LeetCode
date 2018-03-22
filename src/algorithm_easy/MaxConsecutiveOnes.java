package algorithm_easy;

public class MaxConsecutiveOnes {
	private static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (nums[i] == 0) sum = 0;
			else max = Math.max(max, sum);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 0, 1, 1, 1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
}
