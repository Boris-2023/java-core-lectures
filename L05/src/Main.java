import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {
    public static void main(String[] args) {

        File folder = new File(".");
        for (File f : folder.listFiles()) {
            System.out.println(f.getName() + " = " + f.getAbsolutePath());
        }

        System.out.println("\nis it a folder:\t" + folder.isDirectory());
        System.out.println("is it a file:\t" + folder.isFile());
        System.out.println("free space on disk:\t" + folder.getFreeSpace());

        File file = new File(".gitignore");
        System.out.println(file.getFreeSpace());
        System.out.println("\nfile length:\t" + file.length());
        System.out.println("absolute path:\t" + file.getAbsolutePath());
        System.out.println("total on disk:\t" + file.getTotalSpace());
        System.out.println("file deleted:\t " + file.delete());
        System.out.println("file exists:\t" + file.exists());

        // ------> Java 7+
        File file1 = new File("Main.java");
        Path fPath = Paths.get(file1.getName());
        System.out.println("\n" + fPath);

        // Actions with paths
        Path filePath = Paths.get("pics/logo.png");

        Path fName = filePath.getFileName();
        System.out.println("\nFilename:\t" + fName);

        Path parent = filePath.getParent();
        System.out.println("parent folder:\t" + parent);

        boolean endWithTxt = filePath.endsWith("logo.png");
        System.out.println("if ends with 'logo.png':\t" + endWithTxt);
        endWithTxt = filePath.endsWith("png");
        System.out.println("if ends with 'png':\t" + endWithTxt);

        boolean startWithPics = filePath.startsWith("pics");
        System.out.println("if starts with 'pics':\t" + startWithPics);

        System.out.println("To abs path:\t" + filePath.toAbsolutePath());

        filePath = Paths.get("./sources-draft/../pics/logo.png");
        System.out.println("Normalized path:\t" + filePath.normalize());

        // actions with files
        Path path = Paths.get("./file.txt");
        Path dir = Paths.get("./testing");
        try {
            Path file2 = Files.createFile(path);
            System.out.println("Is file created OK:\t" + Files.exists(path));

            Path testDir = Files.createDirectory(dir);
            System.out.println("Is directory created OK:\t" + Files.exists(dir));

            file2 = Files.move(file2, Paths.get("./testing/file.txt"), REPLACE_EXISTING);
            System.out.println("Is file in orig dir yet:\t" + Files.exists(path));
            System.out.println("Is file in testing dir:\t" + Files.exists(Paths.get("./testing/file.txt")));

            // work with content
            System.out.println();
            if (Files.exists(file2)) {
                List<String> lines = Arrays.asList(
                        "Hello 1st line",
                        "Hello 2nd line"
                );
                Files.write(file2, lines, StandardCharsets.UTF_8);
                lines = Files.readAllLines(file2, StandardCharsets.UTF_8);

                lines.forEach(System.out::println);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}