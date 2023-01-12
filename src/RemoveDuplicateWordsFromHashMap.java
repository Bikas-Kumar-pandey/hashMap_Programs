import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateWordsFromHashMap {


    public static void main(String[] args) {


        String str = "Alice is girl and Bob is boy";
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            Integer integer = hashMap.get(word);

            if (integer == null)
                hashMap.put(word, 1);

            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}


//    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        String str = "Do Good you will return Good";
//
//        String[] split = str.split(" ");//it splits acording to space
//        int i = 0;
//        for (String splited : split) {
//            Integer integer = hashMap.get(splited);
//            if (hashMap.containsKey(splited)) {
//                hashMap.get(splited);
//                hashMap.put( splited,integer+1);
//
//            } else hashMap.put(splited,1);
//        }
//        System.out.println(hashMap);
//    }
//}