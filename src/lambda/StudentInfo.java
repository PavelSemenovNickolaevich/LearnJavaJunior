package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
//    public static void main(String[] args) {
//        Student st1 = new Student("Ivan", 'm', 22, 3,8.3);
//        Student st2 = new Student("Nickolay", 'm', 28, 2,6.4);
//        Student st3 = new Student("Elena", 'f', 19, 1,8.9);
//        Student st4 = new Student("Petr", 'm', 35, 4,7);
//        Student st5 = new Student("Mariya", 'f', 23, 3,9.1);
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//        students.add(st4);
//        students.add(st5);
//
//        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.printStudentsOverGrade(students, 8);
//        System.out.println("---------------------------------------");
//        studentInfo.printStudentsUnderAge(students, 30);
//        System.out.println("---------------------------------------");
//        studentInfo.printStudentsMixCondition(students, 20, 9.5, 'f');
//    }
//    void testStudents(ArrayList<Student> al, StudentsChecks sc) {
//        for(Student s: al) {
//            if(sc.check(s)) {
//                System.out.println(s);
//            }
//        }
//    }

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for(Student s: al) {
            if(pr.test(s)) {
                System.out.println(s);
            }
        }
    }

    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
        for(Student s: al) {
            if(s.avgGrade>grade) {
                System.out.println(s);
            }
        }

    }

    void printStudentsUnderAge(ArrayList<Student> al, int age) {
        for(Student s: al) {
            if(s.age < age) {
                System.out.println(s);
            }
        }

    }

    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for(Student s: al) {
            if(s.age>age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }

    }
}

class Test{

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3,8.3);
        Student st2 = new Student("Nickolay", 'm', 28, 2,6.4);
        Student st3 = new Student("Elena", 'f', 19, 1,8.9);
        Student st4 = new Student("Petr", 'm', 35, 4,7);
        Student st5 = new Student("Mariya", 'f', 23, 3,9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(students, new CheckOverGrade());
//        System.out.println("---------------------------------------");
//        studentInfo.testStudents(students, new StudentsChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
        studentInfo.testStudents(students, (Student s) -> {return s.avgGrade > 8;});
        studentInfo.testStudents(students, s -> s.avgGrade > 8);
        System.out.println("---------------------------------------");
        studentInfo.testStudents(students, (Student s) -> {return s.age < 30;});
        System.out.println("---------------------------------------");
        studentInfo.testStudents(students, (Student s) -> s.age > 20 && s.avgGrade < 9.3 && s.sex =='f');


        Function<Student, Double> f = student -> 3.14;
        double res = avgOfSmth(students, student -> student.avgGrade);
        System.out.println(res);


//        studentInfo.printStudentsOverGrade(students, 8);
//        System.out.println("---------------------------------------");
//        studentInfo.printStudentsUnderAge(students, 30);
//        System.out.println("---------------------------------------");
//        studentInfo.printStudentsMixCondition(students, 20, 9.5, 'f');
    }
    private static double avgOfSmth(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (Student st: list) {
            result+= function.apply(st);
        }
        result = result / list.size();
        return result;
    }
}

//interface StudentsChecks {
//    boolean check(Student s);
//}
//
//class CheckOverGrade implements StudentsChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>8;
//    }

