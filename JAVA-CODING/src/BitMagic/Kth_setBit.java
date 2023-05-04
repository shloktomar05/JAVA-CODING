package BitMagic;

public class Kth_setBit {
	
	//Using Leftsift
//	static void solve(int n, int k) {
//		if((n&(1<<(k-1)))!=0) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
//	}
	static void solve(int n, int k) {
		if((n>>(k-1))!=0) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		int n=5;
		int k=3;
		solve(n,k);
	}

}
