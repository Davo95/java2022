package authorbook;

public interface Commands {

    int EXIT = 0;
    int ADD_AUTHOR = 1;
    int SEARCH_AUTHOR = 2;
    int PRINT_AUTHOR = 3;
    int GET_BY_EMAIL = 4;
    int ADD_BOOK = 5;
    int PRINT_ALL_BOOKS = 6;
    int PRINT_BOOKS_BY_PRICE_RANGE = 7;
    int IS_BOOK_EXISTS = 8;

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR + " for SEARCH_AUTHOR");
        System.out.println("Please input " + PRINT_AUTHOR + " for PRINT_AUTHOR");
        System.out.println("Please input " + GET_BY_EMAIL + " for GET_BY_EMAIL");
        System.out.println("Please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT_ALL_BOOKS");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for PRINT_BOOKS_BY_PRICE_RANGE");
        System.out.println("Please input " + IS_BOOK_EXISTS + " for IS_BOOK_EXISTS");

    }
}
