package algorithm_easy;

public class MissingNumber {
	private static int missingNumber(int[] nums) {
		int len = nums.length + 1;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += i;
		}
		
		int particalSum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			particalSum += nums[i];
		}
		
		return sum - particalSum;
	}
	
	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
		System.out.println(missingNumber(new int[] {3,0,1}));
	}
}
