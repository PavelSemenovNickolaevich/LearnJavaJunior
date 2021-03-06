package enums;

public class Test1 {
    void method(int dayOfWeek) {
        System.out.println("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.method(158);
    }
}
