import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }


    public int collectionCount() {
        return this.collection.size();
    }

    public void borrowFromLibrary(Library library) {
        if(this.collectionCount() < library.getCapacity()){
            Book bookRemoved = library.lendBook( );
            this.collection.add(bookRemoved);

        }
    }
}
