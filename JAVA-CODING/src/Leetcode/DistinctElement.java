import java.util.HashMap;

public class DistinctElement {
    public static void main(String[] args) {
        String s = "mathematics";
        System.out.println(getCountOfDistinctElementInAString(s));
    }

    private static int getCountOfDistinctElementInAString(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char c : arr) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        return hmap.size();
    }
}
