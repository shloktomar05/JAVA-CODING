package StreamAPI;

import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s = "dbcadbfega";

        //Method 1
        s.chars().distinct().forEach(c -> System.out.print((char) c));

        System.out.println();

        //Method 2
        String str = "qwerqweiyu";

        Set<Character> set = new LinkedHashSet<>();

        for(char c: str.toCharArray()){
            set.add(c);
        }

        StringBuilder newStr = new StringBuilder();

        for(char c: set){
            newStr.append(c);
        }

        System.out.println("my new string is - "+ newStr.toString());
    }

}
