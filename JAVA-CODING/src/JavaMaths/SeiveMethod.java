package JavaMaths;

import java.util.Arrays;

public class SeiveMethod {  //sieve method
	static void sieve(int n) {
		if(n<=1) return;
		
		boolean isPrime[] = new boolean[n+1];
		
		Arrays.fill(isPrime, true);
		for(int i=2 ; i*i<=n;i++) {
			if(isPrime[i]) {    //this if statement checks for true values 
				for(int j=2*i;j<=n;j=j+i) {
					isPrime[j]=false;    //this loop will make multiple of i as false so when 1st loop runs then it will deal with only true values
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(isPrime[i]) {
				System.out.print(i+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		int num=25;
		sieve(num);
	}

}
