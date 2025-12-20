package practice;

import java.util.Arrays;

public class Test {

	public boolean isPalindrome(int x) {

		int n=x;
		int temp=0;
		while(n>0){
			int j = n%10;
			temp = temp+j;
			n = j;
		}


		return true;
        
    }
	
	public static void main(String[] args) {
	// 	int arr[] = {23,34,45,56,78};
		
	// 	Arrays.stream(arr).forEach(x->System.out.println(x+"*"));
	
	// 	Runnable r = () -> System.out.println("lamda test!!");
	// new Thread(r).start();
		
	}

	

	
}
