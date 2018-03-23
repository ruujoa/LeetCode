package algorithm_easy;

public class PivotIndex {
	private static int findPivotIndex(int[] nums) {
		int sum = 0, leftsum = 0;
		for (int i : nums) {
			sum += i;
		}
		for (int i = 0; i < nums.length; i++) {
			if (leftsum == sum - leftsum - nums[i]) return i;
			leftsum += nums[i];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 7, 3, 6, 5, 6};
		System.out.println(findPivotIndex(nums1));
		int[] nums2 = {1, 2, 3};
		System.out.println(findPivotIndex(nums2));
	}
}
