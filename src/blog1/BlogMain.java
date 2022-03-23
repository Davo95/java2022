package blog1;

import blog1.model.Category;
import blog1.model.Post;
import blog1.model.User;
import blog1.storage.DataStorage;

import java.util.Date;
import java.util.Scanner;

public class BlogMain implements Commands {

    private static DataStorage dataStorage = new DataStorage();
    private static Scanner scanner = new Scanner(System.in);
    private static User currentUser = null;

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            dataStorage.printPost();
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case PRINT_POSTS_BY_AUTHOR:
                    printPostByAuthor();
                    break;
                case PRINT_POSTS_BY_CATEGORY:
                    printPostByCategory();
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    registration();
                    break;
                default:
                    System.out.println("Invalid command! Please try again");
            }
        }
    }

    private static void registration() {
        System.out.println("Please input name,surname, email, password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length == 4) {
            String email = userData[2];
            if (dataStorage.isUsersExist(email)) {
                System.out.println("User with " + email + " already exists");
            }else {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(email);
                user.setPassword(userData[3]);
                dataStorage.add(user);
                System.out.println("User registered!");
            }
        } else {
            System.out.println("Invalid user data");
            registration();
        }
    }

    private static void login() {
        System.out.println("Please input email, password");
        String loginDataStr = scanner.nextLine();
        String[] loginData = loginDataStr.split(",");
        if (loginData.length == 2) {
            if (dataStorage.isUsersExist(loginData[0])) {
                User user = dataStorage.getUsersByEmailAndPassword(loginData[0], loginData[1]);
                if (user == null) {
                    System.out.println("Invalid password");
                } else {
                    System.out.println("Welcome!");
                    currentUser = user;
                    loggedIn();
                }
            } else {
                System.out.println("User with " + loginData[0] + " dose not exists");
            }
        } else {
            System.out.println("Invalid data");
            login();
        }
    }

    private static void loggedIn() {
        boolean isLogin = true;
        while (isLogin) {
            dataStorage.printPost();
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    System.exit(0);
                    break;
                case PRINT_POSTS_BY_AUTHOR:
                    printPostByAuthor();
                    break;
                case PRINT_POSTS_BY_CATEGORY:
                    printPostByCategory();
                    break;
                case ADD_POST:
                    addPost();
                    break;
                case LOGOUT:
                    isLogin = false;
                    break;
                default:
                    System.out.println("Invalid command! Please try again");
            }
        }
    }

    private static void addPost() {
        for (Category value : Category.values()) {
            System.out.print(value + ",");
        }
        System.out.println();
        System.out.println("PLease choose category from list");
        String categoryName = scanner.nextLine();
        try {
            Category category = Category.valueOf(categoryName.toUpperCase());
            System.out.println("Pleas input title, text");
            String postDataStr = scanner.nextLine();
            String[] postData = postDataStr.split(",");
            if (postData.length == 2){
                Post post = new Post();
                post.setAuthor(currentUser);
                post.setCreatedDate(new Date());
                post.setTitle(postData[0]);
                post.setText(postData[1]);
                post.setCategory(category);
                dataStorage.add(post);
                System.out.println("Post was successfully added");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("invalid category name");
            addPost();
        }
    }

    private static void printPostByCategory() {
        for (Category value : Category.values()) {
            System.out.print(value + ",");
        }
        System.out.println();
        System.out.println("PLease choose category from list");
        String categoryName = scanner.nextLine();
        try {
            Category category = Category.valueOf(categoryName.toUpperCase());
            dataStorage.printPostsByCategory(category);
        } catch (IllegalArgumentException e) {
            System.out.println("invalid category name");
        }
    }

    private static void printPostByAuthor() {
        dataStorage.printUsers();
        System.out.println("Please choose author's email");
        String authorEmail = scanner.nextLine();
        if (dataStorage.isUsersExist(authorEmail)) {
            dataStorage.printPostsByUserEmail(authorEmail);
        } else {
            System.out.println("Invalid email");
        }
    }

}
