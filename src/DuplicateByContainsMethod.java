import java.util.HashMap;
import java.util.Map;

public class DuplicateByContainsMethod {
    public static void main(String[] args) {

        String str = "Do Good will be Good";

        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");
        for (String word : words) {
            Integer integer = hashMap.get(word);
            if (hashMap.containsKey(word)) {
                hashMap.put(word,integer+ 1);
            } else hashMap.put(word, 1);
        }
        System.out.println(hashMap);
    }
}
