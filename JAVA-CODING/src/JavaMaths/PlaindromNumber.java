package JavaMaths;

public class PlaindromNumber {
	static boolean  isreverse(int n) {
		int temp=n;
		int rev = 0;
		while(temp>0) {
			int mod = temp%10;
			rev = rev*10 + mod;  //4 40+5 450 +3 453
			temp = temp/10;
		}
		return rev==n;
	}
	public static void main(String[] args) {
		int num = 353;
		System.out.println(isreverse(num));
	}

}
