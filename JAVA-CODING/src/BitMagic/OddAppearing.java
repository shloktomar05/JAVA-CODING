package BitMagic;

public class OddAppearing {
	
	//method -1
//	static void oldAppearing(int arr[], int n) {
//		for(int i=0;i<n;i++) {
//			int res=0;
//			for(int j=0;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					res++;
//				}
//			}
//			if(res%2!=0) {
//				System.out.print(arr[i] +" ");
//			}
//		}
//	}
//	public static void main(String[] args) {
//		
//        int arr[]= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7}, n = 10;
//	    
//	    oldAppearing(arr, n);
//	}

	static void oldAppearing(int arr[], int n) {
		int res=0,g1=0,g2=0;
		for(int i=0;i<n;i++) {
			res=res^arr[i];
		}
		int sum = (res&(~(res-1)));
		for(int i=0;i<n;i++) {
			if((arr[i]&sum)!=0) {
				g1=g1^arr[i];
			}
			else {
				g2=g2^arr[i];
			}
		}
		System.out.print(g1+" "+g2);
	}
	public static void main(String[] args) {
		int arr[]= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7}, n = 10;
	    
	    oldAppearing(arr, n);
	}
}
