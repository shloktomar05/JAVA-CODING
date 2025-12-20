package practice;

import java.util.Scanner;

import JavaMaths.factorial;

public class RemoveHTMLTagsTest {
    static int count (int x){
        int ans = 0;
        while (x>0){
            x = x/10;
            ans++;
        }


        return ans;
    }

    public static int reverse(int x){
        int rev = 0;
        while(x>0){
            int n = x%10;
            rev = rev*10 + n;
            x=x/10;
        }
        return rev;
    }

    public static int factorial(int x){
        int ans=1;
        while(x>0){
           ans =  ans *x;
           x--;
        }
        return ans;
    }
    public static int tarilingZero(int x){
        int zero = 0;
        int ans=1;
        while(x>0){
           ans =  ans *x;
           x--;
        }
        int aa= ans;
        while(aa%10==0){
            zero++;
            aa = aa/10;
        }
        return zero;
    }
    public static int modulo(int a, int b){
        return a%b;
    }

    public static int gcd(int a , int b){
        while (a!=b){
            if (a>b) a = a-b;
            else b=b-a;
        }
        return a;
    }
    // lcm(a,b)=a*b/gcd(a,b)
    public static int Lcm(int a, int b){
        int ans = a*b/gcd(a, b);
        return ans;
    }

    public static boolean isPrime(int a){
        for(int i=2; i<a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
    static boolean isPrime2(int a){
        if( a==1) return false;
        for(int i=2;i*i<a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
    
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // int y = sc.nextInt();
    
    // System.out.println( reverse(x)!= x ?"X : "+x+" is not a palindrome":"X : "+x+" is  a palindrome");
    // System.out.println(count(x));
    // System.out.println(factorial(x));
    // System.out.println(tarilingZero(x));
    // System.out.println(gcd(x,y));
    // System.out.println(modulo(12,3));
    // System.out.println(Lcm(x,y));
    // System.out.println(isPrime(x));
    // System.out.println(isPrime2(x));
}
}
