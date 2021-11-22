import java.util.ArrayList;
import java.util.List;


public class Library {

    private String name;
    private List<Book> bookList;

    public Library(String name, ArrayList<Book> bookList) {
        this.name = name;

        if (bookList == null) {
            this.bookList = new ArrayList<Book>();
        } else {
            this.bookList = bookList;
        }
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String addBook(Book book) {
        bookList.add(book);
        return "Book added.";
    }

    public void booksPrint() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public String titleSearch(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return book.toString();
            }
        }
        return "Not found.";
    }

    public Book bookSearch(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }


    public String searchAuthor(String author) {
        StringBuilder searchedBooks = new StringBuilder();
        boolean isFoundBook = false;
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                searchedBooks.append(book);
                isFoundBook = true;
            }
        }
        if (isFoundBook) {
            return searchedBooks.toString();
        } else {
            return "Not found book of this author.";
        }
    }

    public String deleteBook(Book book) {
        if (bookList.contains(book)) {
            bookList.remove(book);
            return "Book deleted.";
        } else {
            return "Book not found.";
        }
    }

    public String deleteAllBooksAuthor(String author) {
        int numberBooksBeforeDel = bookList.size();
        //bookList.removeAll( author);?????
        int numberOfBooksAfterDel = bookList.size();
        int deletedBooks = numberBooksBeforeDel - numberOfBooksAfterDel;
        return deletedBooks + " Book deleted.";
    }


}
