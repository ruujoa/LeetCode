package algorithm_easy;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbersFinder {
	private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
	
	public static void main(String[] args) {
		int nums1[] = {4,3,2,7,8,2,3,1};
		for (int i : findDisappearedNumbers(nums1)) {
			System.out.print(i + ", ");
		}
		System.out.println();
		int nums2[] = {1,1};
		for (int i : findDisappearedNumbers(nums2)) {
			System.out.print(i + ", ");
		}
	}
}
