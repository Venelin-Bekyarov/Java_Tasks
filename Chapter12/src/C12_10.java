
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class C12_10 {
    public static void main(String[] args) {

        String filePath = "Chapter12/src/numbers.txt";
        String fileName = "numbers.txt";
        try {
            String text = Files.readString(Path.of(filePath));
            String[] fileContent = text.split("\n");
            long length = fileContent.length;
            for (int line = 0; line < length; line++) {
                parseLine(fileName, fileContent[line].trim(), line + 1);
            }
        } catch (FileParseException fpe) {
            System.out.println(fpe.fileName);
            System.out.println(fpe.lineNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void parseLine(String fileName, String lineOfFile, long lineNumber) throws FileParseException {
        boolean containsNumber = true;
        long length = lineOfFile.length();
        for (int symbol = 0; symbol < length; symbol++) {
            if (lineOfFile.charAt(symbol) < 47 | lineOfFile.charAt(symbol) > 57) {
                containsNumber = false;
                break;
            }
        }
        if (!containsNumber)
            throw new FileParseException(fileName, lineNumber);
    }
}

