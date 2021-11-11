import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class C12_08 {
    public static void main(String[] args) {
        String pathname = "Chapter12/src/textFile.txt";
        try {
            String fileBlock = readFile(pathname);
            System.out.println(fileBlock);
        } catch (IOException txt) {
            txt.printStackTrace();
        }
    }

    private static String readFile(String pathname) throws IOException {

        File file = new File(pathname);
        StringBuilder fileContents = new StringBuilder();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + System.lineSeparator());
            }
            return fileContents.toString();
        }
    }
}
