package blog;

public interface BlogCommands {

    int EXIT = 0;
    int ADD_POST = 1;
    int POST_BY_TITLE = 2;
    int SEARCH_POST = 3;
    int POSTS_BY_CATEGORY = 4;
    int DELETE_POST = 5;
    int CHANGE_POST = 6;
    int DELETE_BY_CATEGORY = 7;
    int ALL_POSTS = 8;

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_POST + " for ADD_POST");
        System.out.println("Please input " + POST_BY_TITLE + " for POST_BY_TITLE");
        System.out.println("Please input " + SEARCH_POST + " for SEARCH_POST");
        System.out.println("Please input " + POSTS_BY_CATEGORY + " for POSTS_BY_CATEGORY");
        System.out.println("Please input " + DELETE_POST + " for DELETE_POST");
        System.out.println("Please input " + CHANGE_POST + " for CHANGE_POST");
        System.out.println("Please input " + DELETE_BY_CATEGORY + " for DELETE_BY_CATEGORY");
        System.out.println("Please input " + ALL_POSTS + " for ALL_POSTS");
    }
}
