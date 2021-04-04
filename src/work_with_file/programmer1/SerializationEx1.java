package work_with_file.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("zaur");
        employees.add("Ivaan");
        employees.add("ekena");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin")
        )) {
            objectOutputStream.writeObject(employees);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
