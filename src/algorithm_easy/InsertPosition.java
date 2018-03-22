package algorithm_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertPosition {
	private static int position(List<Integer> nums, int target) {
		nums.add(target);
		Collections.sort(nums);
		return nums.indexOf(target);
	}
	
	private static List<Integer> initList() {
		List<Integer> list = new ArrayList<>();
		int[] nums = {1, 3, 5, 6};
		for (int i : nums) {
			list.add(i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(position(initList(), 5));
		System.out.println(position(initList(), 2));
		System.out.println(position(initList(), 7));
		System.out.println(position(initList(), 0));
	}
}
