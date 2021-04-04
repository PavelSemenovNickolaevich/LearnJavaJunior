package work_with_file.programmer2;

import work_with_file.programmer1.Employees;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialiationEx2 {
    public static void main(String[] args) {
        Employees bestEmployee;

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees4.bin")
        )) {
            bestEmployee = (Employees) inputStream.readObject();
            System.out.println(bestEmployee);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
