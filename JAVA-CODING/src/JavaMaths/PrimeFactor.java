package JavaMaths;


public class PrimeFactor {
	
	//Method -1
//	static boolean isPrime(int n) {
//		if(n==1) return false;
//		if(n==2 || n==3) return true;
//		if(n%2==0 || n%3==0) return false;
//		for(int i=5;i*i<n;i=i+6) {
//			if(n%i == 0 || n%(i+2)==0) return false;
//		}
//		return true;
//	}
//	static void primeFactor(int n) {
//		for(int i=2;i<=n;i++) {
//			if(isPrime(i)) {
//				int x=i;
//				while(n%x==0) {
//					System.out.print(i+" ");
//					x=x*i;
//				}
//			}
//		}
//	}
//	public static void main(String[] args) {
//		int num =10;
//		primeFactor(num);
//	}
	
	
	//Method-2 (optimised)
//	static void primeFactor(int n) {
//		if(n<=1) return;
//		for(int i=2;i*i<=n;i++) {
//			while(n%i==0) {
//				System.out.print(i+ " ");
//				n=n/i;
//			}
//		}
//		if(n>1) {
//			System.out.println(n);
//		}
//	}
//	public static void main(String[] args) {
//		int num =10;
//		primeFactor(num);
//	}
	
	//Method -3 optimised
	static void primeFactor(int n) {
		if(n<=1) return;
		while(n%2==0) {
			System.out.print(2); n=n/2;
		}
		while(n%3==0) {
			System.out.print(3); n=n/3;
		}
		for(int i=5;i*i<=n;i=i+6) {
			while(n%i==0) {
				System.out.print(i);
				n=n/i;
			}
			while(n%(i+2)==0) {
				System.out.print(i+2);
				n=n/(i+2);
			}
		}
		if(n>3) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		int num =10;
		primeFactor(num);
	}

}
