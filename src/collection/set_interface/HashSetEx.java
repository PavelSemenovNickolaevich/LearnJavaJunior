package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Zaur1");
        set.add("Zaur2");
        set.add("Zaur3");

        for(String s: set) {
            System.out.println(s);
        }
    }
}
