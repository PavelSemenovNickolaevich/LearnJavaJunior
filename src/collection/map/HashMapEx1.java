package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Test1");
        map1.put(1001, "Test3");
        map1.put(1002, "Test3");
        map1.put(1003, "Test4");
        map1.put(1004, "Test4");
        map1.put(null, "Test5");
        map1.put(1005, null);
        map1.putIfAbsent(1006, "Test7");
        map1.remove(1001);
        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.containsValue("Test3"));
        System.out.println(map1.containsKey(1002));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

    }
}
