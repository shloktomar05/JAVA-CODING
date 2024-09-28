package JavaMaths;


public class Reverse {
    
    static int reverse(int n){

        int lastNum;
        int reverseNum = 0;
        while (n>0){
            lastNum = n%10;
            n = n/10;
            reverseNum = (reverseNum * 10 )+lastNum;
        }

        return reverseNum;
    }
    
    public static void main(String[] args) {
        int num = 7789;
        System.out.println(reverse(num));
    }
    
}
