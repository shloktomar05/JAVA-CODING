package StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class HighestLenght {
    
    public static void main(String[] args) {
        
        String str = "we are finding the longestt String in a sentence";

        String ans = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println("!!!!!!!!!!!");
        System.out.println(ans);


        //second highest word 

       String secondhighest =  Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
       System.out.println("seconf higest letter in the line "+secondhighest);

       int anss = secondhighest.length();
       System.out.println(anss);


       String str1 = "the quick brown fox jumps over the lazy dog";
       
    }
    
}
