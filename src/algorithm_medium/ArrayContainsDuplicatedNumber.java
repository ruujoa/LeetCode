package algorithm_medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayContainsDuplicatedNumber {
	private static int findDuplicated(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else
				map.put(nums[i], map.get(nums[i]) + 1);
		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
		// 然后通过比较器来实现排序
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			// 降序排序
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}

		});
		
		return list.get(0).getKey();
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 5, 5, 6, 7, 10};
		System.out.println(findDuplicated(nums));
	}
}
