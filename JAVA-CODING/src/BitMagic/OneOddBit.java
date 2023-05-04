package BitMagic;

public class OneOddBit {   //Naive approach
//	static int solve(int arr[], int n) {
//		for(int i=0;i<n;i++) {
//			int count = 0;
//			for(int j=0;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//				if(count%2 !=0) {
//					return arr[i];
//				}
//			}
//		}return 0;
//	}
	
	static int solve(int arr[], int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			res=res^arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {4,3,4,4,4,5,5}, n=7;
		System.out.println(solve(arr,n));
	}

}
