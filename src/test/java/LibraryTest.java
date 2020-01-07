import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;


    @Before

    public void setUp(){
        library = new Library(8000);
        book = new Book("How to sleep all day","Audrey the hamster","Educational");
    }


    @Test
    public void libraryHasCapacity(){
        assertEquals(8000,library.getCapacity());
    }


    @Test
    public void libraryCountStock(){
        assertEquals(0, library.countBook());
    }


    @Test
    public void libraryCanAddBookIfCapacityIsGreaterThanStock(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.countBook());
    }

    @Test
    public void libraryCanLendBookFromStock(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.lendBook();
        assertEquals(2,library.countBook());
    }


}



