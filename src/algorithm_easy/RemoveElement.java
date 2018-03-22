package algorithm_easy;

public class RemoveElement {
	private static int removeElement1(int[] nums, int val) {
	    int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
	}
	
	private static int removeElement2(int[] nums, int val) {
	    int i = 0;
	    int n = nums.length;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            // reduce array size by one
	            n--;
	        } else {
	            i++;
	        }
	    }
	    return n;
	}
	
	public static void main(String[] args) {
		System.out.println(removeElement1(new int[] {2, 3, 3, 2}, 3));
		System.out.println(removeElement2(new int[] {2, 3, 2, 3, 2}, 3));
	}
}
