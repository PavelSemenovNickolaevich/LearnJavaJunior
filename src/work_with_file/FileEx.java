package work_with_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file  = new File("test2.txt");
        File folder = new File("C:\\Users\\test");
        System.out.println("file.getAbsolutePath " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath " + folder.getAbsolutePath());
        System.out.println("-------------------------------");

        System.out.println("file.isAsolute " + file.isAbsolute());
        System.out.println("folder.isAbsolute " + folder.isAbsolute());
        System.out.println("-------------------------------");

        System.out.println("file.isDirectory " + file.isDirectory());
        System.out.println("folder.is~Directory " + folder.isDirectory());
        System.out.println("-------------------------------");

        System.out.println("file.Exist " + file.exists());
        System.out.println("folder.isExist " + folder.exists());
        System.out.println("-------------------------------");

        System.out.println("file.createNewFile " + file.createNewFile());
        System.out.println("folder.mkdir " + folder.mkdir());
        System.out.println("-------------------------------");

        System.out.println("file.length " + file.length());
        System.out.println("folder.length " + folder.length());
        System.out.println("-------------------------------");

        System.out.println("file.delete " + file.delete());
        System.out.println("folder.delete " + folder.delete());
        System.out.println("-------------------------------");

        System.out.println("file.Exist " + file.exists());
        System.out.println("folder.isExist " + folder.exists());
        System.out.println("-------------------------------");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("-------------------------------");

        System.out.println("file.isHidden " + file.isHidden());
        System.out.println("file.canRead " + file.canRead());
        System.out.println("file.canWrite " + file.canWrite());
        System.out.println("file.canExecute " + file.canExecute());

        System.out.println("-------------------------------");

    }
}
