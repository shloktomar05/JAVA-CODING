package JavaMaths;

public class gcd {
	//Method-1 
//	static int gcd(int a, int b) {
//		while(a!=b) {
//			if(a>b) {
//				a=a-b;
//			}
//			else {
//				b=b-a;
//			}
//			
//		}
//		return a;
//	}
	
	//method-2
	static int gcd(int a, int b) {  //a=12, b=15 -> a=15,b=12
		if(b==0)
			return a;
	
		return gcd(b, a%b);          // a = 15 , b = 12%15 -> a=12,b=3 -> a=3,b=0
	}
	
	
	public static void main(String[] args) {
		int a =12, b=15;
		System.out.println(gcd(a,b));
	}

}
