package work_with_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\M");
        Path directoryPathSecond = Paths.get("C:\\Users\\B");

       // Files.copy(filePath, directoryPath.resolve(filePath));
        Files.copy(filePath, directoryPath.resolve(filePath)
        , StandardCopyOption.REPLACE_EXISTING);
        Files.copy(filePath, directoryPath.resolve("Test15.txt"));
        System.out.println("done");;

        Files.copy(directoryPathSecond, directoryPath.resolve("b"));

        Files.move(filePath, directoryPath.resolve("test15.txt"));

    }
}
