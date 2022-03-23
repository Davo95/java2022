package blog1;

public interface Commands {

    int EXIT =0;
    int LOGIN = 1;
    int REGISTER = 2;
    int PRINT_POSTS_BY_CATEGORY = 3;
    int PRINT_POSTS_BY_AUTHOR = 4;
    int ADD_POST = 5;
    int LOGOUT = 6;

    static void printCommands() {
        System.out.println("Please input "+ EXIT +" for EXIT");
        System.out.println("Please input "+ PRINT_POSTS_BY_CATEGORY +" for PRINT_POSTS_BY_CATEGORY");
        System.out.println("Please input "+ PRINT_POSTS_BY_AUTHOR +" for PRINT_POSTS_BY_AUTHOR");
        System.out.println("Please input "+ REGISTER +" for REGISTER");
        System.out.println("Please input "+ LOGIN +" for LOGIN");
    }

    static void printUserCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + PRINT_POSTS_BY_CATEGORY + " for PRINT_POSTS_BY_CATEGORY");
        System.out.println("Please input " + PRINT_POSTS_BY_AUTHOR + " for PRINT_POSTS_BY_AUTHOR");
        System.out.println("Please input " + ADD_POST + " for ADD_POST");
        System.out.println("Please input " + LOGOUT + " for LOGOUT");
    }
}
