import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Book("How to sleep all day","Audrey the hamster","Educational");
        library = new Library(8000);
        library.addBook(book);
    }

    @Test
    public void borrowerCanBorrowBookFromLibrary(){
        library.lendBook();
        borrower.borrowFromLibrary(library);
        assertEquals(1, borrower.collectionCount());
    }

}
