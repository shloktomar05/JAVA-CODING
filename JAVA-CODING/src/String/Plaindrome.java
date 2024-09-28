package String;

public class Plaindrome{

// Naive Approach

    static boolean isPalindrome(String str){
        // StringBuilder rev = new StringBuilder(str);
        // rev.reverse();
        // return str.equals(rev.toString());

    //    efficient approach

    int begin = 0;
    int end = str.length() - 1;

    while (begin < end) {
        if(str.charAt(begin)!=str.charAt(end)){
            return false;
        }
        begin++;
        end--;
        
    }return true;
       

    }




    public static void main(String[] args ){
        String str = "DABCCBAD";
        System.out.println(isPalindrome(str));
    }

}