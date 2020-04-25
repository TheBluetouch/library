package Model;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private boolean isBookPresent(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void deleteBookById(Long id) throws LibraryException {

        if (isBookPresent(id)) {
            Book[] newBookTable = new Book[books.length - 1];

            int offset = 0;
            for (int i = 0; i < books.length; i++) {
                if (!id.equals(books[i].getId())) {
                    newBookTable[i - offset] = books[i];
                } else {
                    offset++;
                }
            }

            books = newBookTable;
        } else {
            throw new LibraryException("Podana książka nie widnieje w bibliotece, wiec nie mozna jej usunąć");
            // System.out.println("nie udalo sie");
        }
    }
}

