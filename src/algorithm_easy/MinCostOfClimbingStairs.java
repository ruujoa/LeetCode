package algorithm_easy;

public class MinCostOfClimbingStairs {
	private static int minCostClimbingStairs(int[] cost) {

	    for(int i=2;i<=cost.length-1;i++){
	        cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
	    }

	    return Math.min(cost[cost.length-1],cost[cost.length-2]);

	}
	
	public static void main(String[] args) {
		System.out.println(minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
	}
}
