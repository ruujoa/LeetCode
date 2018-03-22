package algorithm_easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	private static List<Integer> getRow(int rowIndex) {
	    List<Integer> res = new ArrayList<Integer>();
	    for(int i = 0;i<rowIndex+1;i++) {
	    		res.add(1);
	    		for(int j=i-1;j>0;j--) {
	    			System.out.print(j + ": " + (res.get(j-1)+res.get(j)) + ", ");
	    			res.set(j, res.get(j-1)+res.get(j));
	    		}
	    		System.out.println();
	    }
	    return res;
	}
	
	public static void main(String[] args) {
		getRow(2).stream().forEach(item -> System.out.print(item + ", "));
	}
}
