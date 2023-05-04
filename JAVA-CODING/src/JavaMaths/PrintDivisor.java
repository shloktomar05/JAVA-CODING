package JavaMaths;

public class PrintDivisor {
	
	//Method - 1
//	static void printAllDivisor(int n) {
//		
//		for(int i=1;i*i<=n;i++) {
//			if(n%i==0) {
//				System.out.print(i+" ");
//				if(i != (n/i)) {
//					System.out.print((n/i)+" ");
//				}
//			}
//			
//		}
//	}
//	public static void main(String[] args) {
//		int num = 10;
//		printAllDivisor(num);
//	}

	// Above method will give factors but in unsorted manner , for getting above factor in sorted order
	
	//method -2
	static void printAllDivisor(int n) {
			int i=1;
			for( i=1;i*i<=n;i++) {
				if(n%i==0) {
					System.out.print(i+" ");
				}	
			}
			for(;i>=1;i--) {
				if(n%i==0) {
					System.out.print((n/i)+ " ");
				}
			}
		
		

		
		
	}
	public static void main(String[] args) {
		int num = 10;
		printAllDivisor(num);
	}

	
}
