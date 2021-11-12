
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class C12_09 {
    public static void main(String[] args) {
        String path = "Chapter12/src/textFile.txt";
        String outputPath = "Chapter12/src/copyFile.txt";
        try {
            byte[] content = ReadBinaryFile(path);
            Files.write(Path.of(outputPath), content);
            if (checkEquality(Files.readAllBytes(Path.of(path)), Files.readAllBytes(Path.of(outputPath)))) {
                System.out.println("Files are the same.");
            } else {
                System.out.println("Files are not the same.");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkEquality(byte[] content, byte[] content2) {
        if (content.length != content2.length)
            return false;
        for (int i = 0; i < content.length; i++) {
            if (content[i] != content2[i])
                return false;
        }
        return true;
    }

    private static byte[] ReadBinaryFile(String path) throws IOException {
        return Files.readAllBytes(Path.of(path));
    }
}
