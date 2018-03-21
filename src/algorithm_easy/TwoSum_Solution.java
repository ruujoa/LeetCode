package algorithm_easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_Solution {
	private static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 5, 5, 11};
		int[] results = twoSum(nums, 10);
		System.out.println("[" + results[0] + ", " + results[1] + "]");
	}
}
