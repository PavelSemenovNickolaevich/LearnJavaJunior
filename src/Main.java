import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Object> data = Arrays.asList("A", "B", Arrays.asList("D", Arrays.asList("E", "F"), "G"));
        fun(data, "-");

    }
    public static void fun(List<Object> data, String str) {
//        for(Object s: data) {
//            System.out.print(str);
//            if(s instanceof String) {
//                System.out.println(s);
//            }
//            if (s instanceof List) {
//                fun((List)s, str);
//            }
//        }
        data.forEach(s -> {
            System.out.println(str);
        });
    }
}
