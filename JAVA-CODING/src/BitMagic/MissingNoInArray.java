package BitMagic;

public class MissingNoInArray {
	static int missingNo(int arr[],int n) {
		int res=0;
		for(int i=1;i<=n+1;i++) {
			res=res^i;
		}
		for(int j=0;j<n;j++) {
			res=res^arr[j];
		}
		return res;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,4,3}, n=3;
		System.out.println(missingNo(arr,n));
	}

}
