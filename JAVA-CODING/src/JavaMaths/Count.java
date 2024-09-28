package JavaMaths;

public class Count {
	
	static int count(int n) {
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
			
		}
		
		return count;
	}

	static int optimsed(int n){
		int count = (int)Math.log10(n)+1;
		return count;
	}
	
	
	public static void main(String[] args) {
		
		int num = 567;
		System.out.println(count(num));
		System.out.println(optimsed(num));
		
	}

}
