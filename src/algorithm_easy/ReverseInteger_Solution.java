package algorithm_easy;

public class ReverseInteger_Solution {
	private static int reverseInt(int x) {
        long rev= 0;
        while( x != 0){
        		System.out.println("before rev & x:" + rev + ", " + x);
            rev= rev*10 + x % 10;
            x= x/10;
            System.out.println("after rev & x:" + rev + ", " + x);
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }
	
	public static void main(String[] args) {
		System.out.println(reverseInt(-23453));
	}
}
