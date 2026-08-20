package Collections;
import java.util.*;
public class Hm {
    public static void main(String[] args) {
        HashMap<String,Integer> hmp=new HashMap<>();
                                                            // if access order true then not arranged by insertion order but by ... least recently used...
        LinkedHashMap<String,Integer> hm1=new LinkedHashMap<>(10,0.75f,true);

        hmp.put("apple",1);
        hmp.put("watermelon",2);
        hmp.put("apple", hmp.getOrDefault("apple", 0)+1);
        hm1.put("apple",1);
        hm1.put("watermelon",2);
        hm1.put("apple", hm1.getOrDefault("apple", 0)+1);
        System.out.println(hmp.get("apple"));
        System.out.println(hmp.containsKey("apple"));
        System.out.println(hmp.containsKey("orange"));
        hmp.merge("orange", 1, Integer::sum);
        hm1.merge("orange", 1, Integer::sum);
        hmp.forEach((key,value) -> System.out.println(key+" "+value));
        hm1.forEach((key,value) -> System.out.println(key+" "+value));
    }
}
