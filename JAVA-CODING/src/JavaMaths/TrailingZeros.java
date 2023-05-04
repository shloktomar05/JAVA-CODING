package JavaMaths;

public class TrailingZeros {
	// every 2 and 5 will ake one zeros
	
	
	static int trailingzero(int n) {
		int res =0;
		for(int i=5;i<n; i=i*5) {
			res = res + (n/i);
		}
		return res;
	}
	public static void main(String[] args) {
		int num = 10;
		System.out.println(trailingzero(num));
	}

}
