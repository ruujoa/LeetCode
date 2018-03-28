package algorithm_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionArray1 {
	private static List<Integer> intersection(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums1) {
			if (!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i, map.get(i).intValue() + 1);
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i : nums2) {
			if (map.containsKey(i) && map.get(i) > 0) {
				list.add(i);
				map.put(i, map.get(i).intValue() - 1);
			}
		}	
		
		return list;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		for (int i : intersection(nums1, nums2)) {
			System.out.print(i + ", ");
		}
	}
}
