package algorithm_easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairSum {
	private static int pairSum(Integer[] nums) {
		int sum = 0;
		List<Integer> list = Arrays.asList(nums);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 != 0) continue;
			sum += list.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Integer[] nums = {1, 4, 3, 2};
		System.out.println(pairSum(nums));
	}
}
