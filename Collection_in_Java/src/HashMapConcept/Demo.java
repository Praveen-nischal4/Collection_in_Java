package HashMapConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
    public static void main(String[] args) {
        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);

        // TreeMap example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("three", 3);
        treeMap.put("four", 4);

        // LinkedHashMap example
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("five", 5);
        linkedHashMap.put("six", 6);

        // Hashtable example
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("seven", 7);
        hashtable.put("eight", 8);

        // ConcurrentHashMap example
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("nine", 9);
        concurrentHashMap.put("ten", 10);

        // Print the maps
        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Hashtable: " + hashtable);
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);
    }
}
