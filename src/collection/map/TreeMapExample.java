package collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
//        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });
        Student sr1 = new Student("Test1", "Test1", 1);
        Student sr2 = new Student("Test2", "Test2", 2);
        Student sr3 = new Student("Test3", "Test3", 3);
        Student sr4 = new Student("Test4", "Test4", 4);
        Student sr5 = new Student("Test5", "Test5", 5);
        Student sr6 = new Student("Test6", "Test6", 6);
        Student sr7 = new Student("Test7", "Test7", 7);
//        treeMap.put(1.8, sr5);
//        treeMap.put(0.8, sr2);
//        treeMap.put(6.8, sr4);
//        treeMap.put(4.8, sr3);
//        treeMap.put(3.8, sr6);
//        treeMap.put(8.8, sr7);
//        treeMap.put(5.8, sr1);

        treeMap.put(sr5, 0.6);
        treeMap.put(sr1, 4.6);
        treeMap.put(sr3, 5.9);
        System.out.println(treeMap);

    }
}
