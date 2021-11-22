public class Book {

    private String title;
    private String author;
    private String publisher;
    private int publishingYear;
    private int ISBN;

    public Book(String title, String author, String publisher, int publishingYear, int iSBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.ISBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String toString() {
        return '\n'+"Book{" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", publisher = '" + publisher + '\'' +
                ", publishingYear = " + publishingYear +
                ", ISBN = " + ISBN +
                '}';
    }

}
