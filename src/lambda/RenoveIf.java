package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RenoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("privet");
        al.add("poka");
        al.add("ok");
        al.add("uchim java");
        al.add("uchim lambda");
    //    al.removeIf(element -> element.length() < 5);
        Predicate<String> p = element -> element.length() < 5;
        al.removeIf(p);
        System.out.println(al);
    }
}
