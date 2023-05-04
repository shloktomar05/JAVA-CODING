package BitMagic;

public class PowerOfTwo {
	
	//method - 1 Naive approach
//	static boolean solve(int n) {
//		int res=0;
//		if(n==0) return false;
//		while(n!=1) {
//			if(n%2!=0) {
//				return false;
//			}
//			n=n/2;
//		}
//		return true;
//	}
	
	//Method - 2 optimised
	static boolean solve(int n) {
		if(n==0) return false;
		return ((n&(n-1))==0);
	}
	public static void main(String[] args) {
		int n=18;
		System.out.println(solve(n));
	}

}
