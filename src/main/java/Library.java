import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity){

        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }


    public int getCapacity() {
        return this.capacity;
    }


    public int countBook() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if(this.countBook() < this.capacity){
        this.stock.add(book);
        }
    }

    public Book lendBook() {
        Book bookRemoved = null;
        if(this.countBook()>0){
            bookRemoved = this.stock.remove(0);
        }
        return bookRemoved;
    }


}
