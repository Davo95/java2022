package authorbook.storage;

import authorbook.exception.AuthorNotFoundException;
import authorbook.model.Author;

public class AuthorStorage {

    private Author[] authors = new Author[10];

    private int size;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(name)){
                System.out.println(authors[i]);
            }
        }
    }
    public Author getByEmail(String email) throws AuthorNotFoundException {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().contains(email)){
                return authors[i];
            }
        }
        throw new ArithmeticException("Author with " + email +" does not exists");
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i] + ", ");
        }
    }
}
