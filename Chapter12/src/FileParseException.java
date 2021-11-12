public class FileParseException extends Exception {
    public String fileName;
    public long lineNumber;

    public FileParseException(String fileName, long lineNumber) {


        super(String.format("Error while parsing file %s on line %d.", fileName, lineNumber));

        this.fileName = fileName;
        this.lineNumber = lineNumber;
    }
}
