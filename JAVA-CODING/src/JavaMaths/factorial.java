package JavaMaths;

public class factorial {
	
	static int factorial(int n) {
		
		//method 1 using recursion
//		if(n==0) return 1;
//		return n*factorial(n-1);
		
		//method 2 using forloop
		int res =1;
		for(int i=2; i<=n; i++) {
			res = res * i;
			
		}
		return res;
	
	}
	public static void main(String[] args) {
		int num=10;
		System.out.println(factorial(num));
	}

}
