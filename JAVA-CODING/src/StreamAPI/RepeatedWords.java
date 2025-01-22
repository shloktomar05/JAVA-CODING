package StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class RepeatedWords {
    public static void main(String[] args) {
        String str = "the brown laxy fox jumps over the lazy brown dog fox fox";


       Map<String,Long> ans =  Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       System.out.println(ans);
    }
    
}
