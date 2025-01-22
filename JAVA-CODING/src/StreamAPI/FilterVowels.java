package StreamAPI;

import java.util.Arrays;

public class FilterVowels {
    public static void main(String[] args) {
        
        String str = "the brown laxy fox jumps over the lazy brown dog fox fox";

        Arrays.stream(str.split(" ")).filter(x->x.replaceAll("[aeiouAEIOU]", "").length()==2).forEach(System.out::println);
    }
    
}
