import java.util.Objects;
import java.util.Scanner;

public class LibraryTest {

    static StringBuilder outputString = new StringBuilder();

    static void startTesting() {
        Scanner scanner = new Scanner(System.in);
        Library helikon = new Library("Helikon", null);
        String row = scanner.nextLine();
        while (!Objects.equals(row, "")) {
            String[] separators = {",", "(", ")"};
            String[] inputLine = row.split("[{},()]+");
            for (int i = 0; i < inputLine.length; i++) {
                inputLine[i] = inputLine[i].trim();
            }
            commandExecutes(inputLine, helikon);
            row = scanner.nextLine();
        }
    }

    static void commandExecutes(String[] inputLine, Library helikon) {
        switch (inputLine[0]) {
            case "addBook": {
                outputString.append(helikon.addBook
                        (new Book(inputLine[1], inputLine[2], inputLine[3], Integer.parseInt(inputLine[4]), Integer.parseInt(inputLine[5]) + '\'')));
                break;
            }
            case "searchAuthor": {
                outputString.append(helikon.searchAuthor(inputLine[1]));
                break;
            }
            case "titleSearch": {
                outputString.append(helikon.titleSearch(inputLine[1])).append('\'');
                break;
            }
            case "deleteBook": {
                Book bookToDelete = helikon.bookSearch(inputLine[1]);
                if (bookToDelete != null){
                    outputString.append(helikon.deleteBook(bookToDelete) + '\'');
                }
                break;
            }
            case "deleteAllBooksAuthor": {
                outputString.append(helikon.deleteAllBooksAuthor(inputLine[1]) + '\'');
                break;
            }
            default: {
                outputString.append("Unknown operation." + '\'');
                break;
            }
        }
    }

    static void printOutput() {
        System.out.println(outputString.toString());
    }

    public static void main(String[] args) {
        startTesting();
        printOutput();
    }

}

