package algorithm_easy;

public class MaximumSubarray {
	private static int maxSubArray(int [] a , int left , int right){
		int maxLeftSum, maxRightSum;
	    int maxLeftBorderSum, maxRightBorderSum;
	    int leftBorderSum, rightBorderSum;

	    if(left == right)
	        if(a[left] > 0)
	            return a[left];
	        else
	            return 0;

	    int mid = (left + right) / 2, i;
	    maxLeftSum = maxSubArray(a, left, mid);
	    maxRightSum = maxSubArray(a, mid + 1, right);

	    maxLeftBorderSum = 0;leftBorderSum = 0;
	    for(i = mid; i >= left; i--){
	        leftBorderSum += a[i];
	        if(leftBorderSum > maxLeftBorderSum)
	            maxLeftBorderSum = leftBorderSum;
	    }

	    maxRightBorderSum = 0; rightBorderSum = 0;
	    for(i = mid + 1; i <= right; i++){
	        rightBorderSum += a[i];
	        if(rightBorderSum > maxRightBorderSum)
	            maxRightBorderSum = rightBorderSum;
	    }

	    return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
	}
	
	private static int maxSubSum(int [] a ){
        int maxSum = 0 , thisSum = 0;
        for( int i = 0; i < a.length ; i ++ ){
            thisSum += a[ i ];
            if(thisSum > maxSum)
                maxSum = thisSum;
            else if(thisSum < 0)
                thisSum = 0;
            
            System.out.println( i + ": " + maxSum + ", " + thisSum);
        }
        return maxSum;
    }
	
	private static int max3(int a, int b, int c) {
		if(a > b)
	        return a > c ? a : c;
	    else
	        return b > c ? b : c;
	}
	
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums, 0, nums.length-1));
		System.out.println(maxSubSum(nums));
	}
}
