package authorbook;

import authorbook.exception.AuthorNotFoundException;
import authorbook.model.Author;
import authorbook.model.Book;
import authorbook.model.Gender;
import authorbook.storage.AuthorStorage;
import authorbook.storage.BookStorage;

import java.util.Scanner;

public class AuthorBookTest implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                command = -1;
            }

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR:
                    searchByName();
                    break;
                case PRINT_AUTHOR:
                    authorStorage.print();
                    break;
                case GET_BY_EMAIL:
                    findAuthorByEmail();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    bookByPriceRang();
                    break;
                case IS_BOOK_EXISTS:
                    isBookExistsEmail();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }

    }

    private static void findAuthorByEmail() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        Author author = null;
        try {
            author = authorStorage.getByEmail(email);
        } catch (AuthorNotFoundException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(author);
    }

    private static void isBookExistsEmail() {
        System.out.println("please input title, authorEmail");
        String str = scanner.nextLine();
        String title = str.split(",")[0];
        String authorEmail = str.split(",")[1];
        System.out.println(bookStorage.isBookExistsEmail(title, authorEmail));
    }

    private static void bookByPriceRang() {
        System.out.println("please input min, max prices");
        String range = scanner.nextLine();
        int min = Integer.parseInt(range.split(",")[0]);
        int max = Integer.parseInt(range.split(",")[1]);
        bookStorage.bookByPriceRang(min, max);
    }

    private static void addBook() {
        System.out.println("Please input Book's title, description, price, count, authorEmail");
        String bookStr = scanner.nextLine();
        String[] bookStrArray = bookStr.split(",");

        try {
           Author author = authorStorage.getByEmail(bookStrArray[4]);
            Book book = new Book();
            book.setTitle(bookStrArray[0]);
            book.setDescription(bookStrArray[1]);
            book.setPrice(Double.parseDouble(bookStrArray[2]));
            book.setCount(Integer.parseInt(bookStrArray[3]));
            book.setAuthor(author);
            bookStorage.add(book);
            System.out.println("Book was added");
        } catch (AuthorNotFoundException e) {
            System.err.println(e.getMessage());
            addBook();
        } catch (NumberFormatException e) {
            System.err.println("Please input valid number");
            addBook();
        }
    }

    private static void addAuthor() {
        System.out.println("Please input Author's name, surname, email, age, gender (MALE, FEMALE)");
        String authorStr = scanner.nextLine();
        String[] authorStrArray = authorStr.split(",");
        try {
            Author author = new Author();
            author.setName(authorStrArray[0]);
            author.setSurname(authorStrArray[1]);
            author.setEmail(authorStrArray[2]);
            author.setAge(Integer.parseInt(authorStrArray[3]));
            author.setGender(Gender.valueOf(authorStrArray[4]));
            authorStorage.add(author);
            System.out.println("Author was added");
        } catch (NumberFormatException e) {
            System.err.println("Please input valid number");
            addAuthor();
        }
    }

    private static void searchByName() {
        System.out.println("please input name");
        String name = scanner.nextLine();
        authorStorage.searchByName(name);
    }
}
