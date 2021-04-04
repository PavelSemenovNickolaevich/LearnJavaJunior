package work_with_file.programmer1;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "white");
        Employees employee = new Employees("maria","Ivanova","it"
             //   , 28
                , 500, car);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees4.bin")
        )){
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
