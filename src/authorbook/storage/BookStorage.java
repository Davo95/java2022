package authorbook.storage;

import authorbook.model.Book;

public class BookStorage {
    private Book[] books = new Book[10];

    private int size;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }

    public void bookByPriceRang(int min, int max) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getPrice() >= min &&
                    book.getPrice() <= max) {
                System.out.println(book);
            }
        }
    }

    public boolean isBookExistsEmail(String title, String authorEmail) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getTitle().equals(title)
                    && book.getAuthor().getEmail().equals(authorEmail)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i] + ", ");
        }
    }
}
