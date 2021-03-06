package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();
       // List<? extends Number> list30 = new ArrayList<>();
        List<Integer> list30 = new ArrayList<>();
        List<? super Number> list31 = new ArrayList<Number>();
        list30.add(4);
        list31.add(4);

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.15);
        showListInfo(list);
        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("privet");
        list2.add("poka");
        showListInfo(list);
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.15);
        System.out.println(sum((ald)));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(353);
        ali.add(30);
        ali.add(30);
        System.out.println(sum((ali)));



    }

    static  void showListInfo(List<?> list) {
        System.out.println("Moy lis sodergit sleduyushie elementi:" + list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for(Number n: al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
