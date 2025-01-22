public class ReverseArray {

    static void rvereseArray(int arr[], int start, int end){
        int temp;
        while(start > end)
       { 
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start ++;
        end --;
    }

    static void printArray(int arr[], int n){
        for each(int x : arr[n]){
            System.out.println(x + " ");
        }

    }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        printArray(arr, 6); 
        rvereseArray(arr, 0, 5); 
        System.out.print("Reversed array is \n"); 
        printArray(arr, 6); 
    }
}
