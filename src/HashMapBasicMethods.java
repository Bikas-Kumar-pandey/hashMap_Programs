import java.util.*;


public class HashMapBasicMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        h.put(1, "bikas");
        h.put(2, "kumar");
        h.put(3, "pandey");
        h.put(4, "java");
        h.put(5, "springboot");
        h.put(1, "xavier");
//        System.out.println("Print object with values ");
//        System.out.println(h);
//        System.out.println("getting 2nd object with String value ");
//        System.out.println(h.get(2).toString());
//        System.out.println("using for each loop to get individual key and value pair ");
//        for (Map.Entry  m : h.entrySet()) {
//            System.out.println(m.getKey() +" "+m.getValue());
//        }
//        System.out.println("Removing elements with only key");
//        System.out.println(h.remove(2));
//        System.out.println("Removing elements with only key and value");
//        System.out.println(h.remove(1,"xavier"));
//        System.out.println(h);
        System.out.println(h.replace(2, "kumars"));
        System.out.println(h);
        System.out.println("Replace All elements with different value ");
        h.replaceAll((k, v) -> "sakib");
        System.out.println(h);

    }
}

