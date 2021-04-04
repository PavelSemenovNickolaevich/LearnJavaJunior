package work_with_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\M");

        System.out.println("filePath.getFileName " + filePath.getFileName());
        System.out.println("directoryPath.getFileName " + directoryPath.getFileName());
        System.out.println("--------------------------------------");

        System.out.println("filePath.getParent " + filePath.getParent());
        System.out.println("directoryPath.getParent " + directoryPath.getParent());
        System.out.println("--------------------------------------");

        System.out.println("filePath.getRoot " + filePath.getRoot());
        System.out.println("directoryPath.getRoot " + directoryPath.getRoot());
        System.out.println("--------------------------------------");

        System.out.println("filePath.isAbsolute " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute " + directoryPath.isAbsolute());
        System.out.println("--------------------------------------");

        System.out.println("filePath.toAbsolute " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolute " + directoryPath.toAbsolutePath().getRoot());
        System.out.println("--------------------------------------");

       // System.out.println("filePath.getFileName " + filePath.getFileName());
        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));
        System.out.println("--------------------------------------");

        System.out.println("filePath.getFileName " + filePath.getFileName());
        System.out.println("directoryPath.getFileName " + directoryPath.relativize(filePath));
        System.out.println("--------------------------------------");

        if(!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        if(!Files.exists(directoryPath)) {
            Files.createFile(directoryPath);
        }

        System.out.println("directory.isReadable(filePath) " + Files.isReadable(filePath));
        System.out.println("directory.isWritable(filePath) " + Files.isReadable(filePath));
        System.out.println("directory.isExecutable(filePath) " + Files.isReadable(filePath));
        System.out.println("--------------------------------------");

//
//        Path filePath2 = Paths.get("C:\\Users\\pavelsemenov\\IdeaProjects\\LearnJavaJunior\\test15.txt");
//        System.out.println(Files.isSameFile(filePath, filePath2));

        System.out.println("" + Files.getAttribute(filePath, "creationTime"));
        System.out.println("" + Files.getAttribute(filePath, "size"));

        Map<String, Object> testAttributes = Files.readAttributes(filePath, "*");
        for(Map.Entry<String, Object> entry: testAttributes.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }




    }
}
