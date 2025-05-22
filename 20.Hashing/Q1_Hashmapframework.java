import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Q1_Hashmapframework{
    public static void main(String[] args) {
        HashMap<String, Integer> hm  = new HashMap<>(); 
        hm.put("Uday", 1000); //Time Complexity = O(1)
        hm.put("Sachin", 1001);
        hm.put("Aashish", 1002);
        hm.put("Harsh", 1003);

        System.out.println(hm);
        if(hm.containsKey("Uday")) { // tm = O(1)
            System.out.println("Yes it's contain");
        }

        System.out.println(hm.get("Uday")); //tm = O(1)
        System.out.println(hm.hashCode());
        System.out.println(hm.size());

        //Iteration on hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String string : keys) {
            System.out.println("Keys "+string);
        }

        //Linked Hashmap implemtation
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        lhm.put(4, 1002);
        lhm.put(1, 10);
        lhm.put(2, 101);
        lhm.put(3, 102);
        System.out.println(lhm);

        //Tree map implemtation
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Uday", 100);
        tm.put("Sachin", 100);
        tm.put("Aashish", 99);
        System.out.println(tm);
    }
}