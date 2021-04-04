package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(-3);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);
//        Collections.sort(arrayList);
//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1);

//        Employee employee1 = new Employee(100, "Zaur", 12345);
//        Employee employee2 = new Employee(15, "Ivan", 6542);
//        Employee employee3 = new Employee(123, "Petr", 8542);
//        Employee employee4 = new Employee(15, "Mariya", 5678);
//        Employee employee5 = new Employee(182, "Kolya", 125);
//        Employee employee6 = new Employee(15, "Sasha", 9874);
//        Employee employee7 = new Employee(250, "Elena", 1579);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);
//        employeeList.add(employee4);
//        employeeList.add(employee5);
//        employeeList.add(employee6);
//        employeeList.add(employee7);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//        int index2 = Collections.binarySearch(employeeList, new Employee(182, "Kolya", 125));
//        System.out.println(index2);

        int [] array = {-3 , 8, 12, -8, 0, 5, 10, 1, 150 , -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 150);
        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee> {
    String name;
    int salary;
    int id;

    public Employee(int id, String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        int result = this.id - anotherEmployee.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmployee.name);
        }
        return result;
    }
}
