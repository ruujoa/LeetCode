package algorithm_easy;

public class ZeroMovement {
	private static int[] moveZero(int[] nums) {
		int zero = 0;
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				temp = nums[i];
				nums[i] = nums[zero];
				nums[zero] = temp;
				zero++;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12}; 
		for (int i : moveZero(nums)) {
			System.out.print(i + ", ");
		}
	}
}
