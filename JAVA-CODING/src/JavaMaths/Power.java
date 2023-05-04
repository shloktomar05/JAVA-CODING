package JavaMaths;

public class Power {
	
	//method -1 (Naive Solution)
//	static int power(int n, int p )
//	{
//		int ans=1;
//		if(n==0) return 1;
//		if(n==1) return n;
//		for(int i=1;i<=p;i++) {
//			ans = ans*n;
//		}
//		return ans;
//	}
//	public static void main(String[] args) {
//		
//		int n =5 ,p=1;
//		System.out.println(power(n,p));
//	}
	//********************************************************
	//Method -2 
//	static int power(int n, int p )
//	{
//		if(p==0) return 1;
//		int temp = power(n,p/2);
//		temp=temp*temp;
//		if(p%2==0) {
//			return temp;
//		}
//		else {
//			return temp*n;
//		}
//		
//	}
//	public static void main(String[] args) {
//		
//		int n =5 ,p=3;
//		System.out.println(power(n,p));
//	}
//****************************************************************
	static int power(int x, int n )
	{
	int res =1;
	while(n>0) {
		if(n%2 != 0) {
			res = res*x;
			x=x*x;
			n=n/2;
		}
	}
	return res;
		
	}
	public static void main(String[] args) {
		
		int x=4 ,n=3;
		System.out.println(power(x,n));
	}
}
