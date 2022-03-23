package blog;

import blog.model.Category;
import blog.model.Post;
import blog.storage.PostStorage;
import blog.storage.PostStorageImpl;
import blog.util.DateUtil;

import java.text.ParseException;
import java.util.Scanner;

public class BlogTest implements BlogCommands {

    private static Scanner scanner = new Scanner(System.in);
    private static PostStorage postStorage = new PostStorageImpl();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            BlogCommands.printCommands();
            int commands;
            try {
                commands = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                commands = -1;
            }

            switch (commands) {
                case EXIT:
                    run = false;
                    break;
                case ADD_POST:
                    addPost();
                    break;
                case SEARCH_POST:
                    searchPost();
                    break;
                case POST_BY_TITLE:
                    getPostByTitle();
                    break;
                case POSTS_BY_CATEGORY:
                    printPostsByCategory();
                    break;
                case DELETE_POST:
                    deleteByPost();
                    break;
                case CHANGE_POST:
                    changePost();
                    break;
                case DELETE_BY_CATEGORY:
                    deleteByCategory();
                    break;
                case ALL_POSTS:
                    postStorage.postPrint();
                    break;
                default:
                    System.out.println("Wrong command!");
            }

        }

    }

    private static void deleteByCategory() {
        System.out.println("Please input delete category");
        Category[] values = Category.values();
        for (Category value : values) {
            System.out.print(value + ", ");
        }
        String category = scanner.nextLine();
        postStorage.deleteByCategory(category);
    }

    private static void changePost() {
        System.out.println("Please input title");
        String title = scanner.nextLine();
        postStorage.newChangePost(title);
    }

    private static void deleteByPost() {
        System.out.println("Please input delete title");
        String title = scanner.nextLine();
        postStorage.deleteByTitle(title);
    }

    private static void printPostsByCategory() {
        System.out.println("please input category");
        Category[] values = Category.values();
        for (Category value : values) {
            System.out.print(value + ", ");
        }
        String category = scanner.nextLine();
        postStorage.printPostsByCategory(category);
    }

    private static void getPostByTitle() {
        System.out.println("please input title");
        String title = scanner.nextLine();
        postStorage.getPostByTitle(title);
    }

    private static void searchPost() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        postStorage.searchByTitle(keyword);
    }

    private static void addPost() {
        System.out.println("Please input Post's title, text, cratedDate");
        System.out.println("Category");
        Category[] values = Category.values();
        for (Category value : values) {
            System.out.print(value + ", ");
        }
        String strPost = scanner.nextLine();
        String[] postStrArray = strPost.split(",");
        try {
            Post post = new Post();
            post.setTitle(postStrArray[0]);
            post.setText(postStrArray[1]);
            String createdDate = postStrArray[2];
            post.setCreatedDate(DateUtil.stringToDate(createdDate));
            post.setCategory(Category.valueOf(postStrArray[3]));
            postStorage.add(post);
            System.out.println("Post was added");
        } catch (ParseException e) {
            System.out.println("Please input valid date");
            addPost();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please input all required date");
            addPost();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
