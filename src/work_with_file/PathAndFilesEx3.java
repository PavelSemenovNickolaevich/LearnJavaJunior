package work_with_file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filepath = Paths.get("test10.txt");
        Files.createFile(filepath);
        String dialog = "-Privet\n-Poka";

        Files.write(filepath, dialog.getBytes());

        List<String> list = Files.readAllLines(filepath);
        for (String s: list) {
            System.out.println(s);
        }

    }
}
