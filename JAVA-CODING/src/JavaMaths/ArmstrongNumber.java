package JavaMaths;

public class ArmstrongNumber {

    // example  N =371  =>  3³ + 7³ +1³   => 371  are armstriong number
    
    static boolean isArmstrong(int n){

        int duplicate = n;
        int lastNum;
        int armsNum = 0;
        while (n>0) {

            lastNum = n%10;
            n=n/10;
            armsNum = armsNum+(lastNum*lastNum*lastNum);
            
        }
        if(armsNum==duplicate) return true;

        return false; 
    }
    
    public static void main(String[] args) {

       int num =371; 
        System.out.println(isArmstrong(num));
    }
    
}
