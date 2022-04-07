package adPortal;

import adPortal.commonds.AdUserCommands;
import adPortal.model.Ad;
import adPortal.model.User;
import adPortal.model.enumModel.Category;
import adPortal.model.enumModel.Gender;
import adPortal.storage.AdStorage;
import adPortal.storage.UserStorage;
import adPortal.storage.impl.AdStorageImpl;
import adPortal.storage.impl.UserStorageImpl;

import java.util.Date;
import java.util.Scanner;

public class AdPortalTest implements AdUserCommands {

    private static Scanner scanner = new Scanner(System.in);
    private static UserStorage userStorage = new UserStorageImpl();
    private static AdStorage adStorage = new AdStorageImpl();
    private static User currentUser = null;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            AdUserCommands.printUser();
            int commands;
            try {
                commands = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                commands = -1;
            }
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    loginUser();
                    break;
                case REGISTER:
                    register();
                    break;
                case PRINT_ALL_ADS:
                    adStorage.printAllAds();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    private static void loginUser() {
        System.out.println("Please input phoneNumber, password");
        String userStr = scanner.nextLine();
        String[] userStrArray = userStr.split(",");
        User user = userStorage.getByPhone(userStrArray[0]);
        if (user == null) {
            System.out.println("User dose not exists!");
        } else {
            if (user.getPassword().equals(userStrArray[1])) {
                System.out.println("Welcome " + user.getName() + "!");
                currentUser = user;
                login();
            } else {
                System.out.println("password is incorrect!");
            }
        }
    }

    private static void register() {
        System.out.println("Please input name, surname, gender(MALE, FEMALE), age, phoneNumber, password");
        String userStr = scanner.nextLine();
        String[] userStrArray = userStr.split(",");
        User user = new User(userStrArray[0], userStrArray[1], Gender.valueOf(userStrArray[2]),
                Integer.parseInt(userStrArray[3]), userStrArray[4], userStrArray[5]);
        userStorage.addUser(user);
    }

    private static void login() {
        boolean isLogin = true;
        while (isLogin) {
            AdUserCommands.printAd();
            int commands;
            try {
                commands = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                commands = -1;
            }
            switch (commands) {
                case LOGOUT:
                    currentUser = null;
                    isLogin = false;
                    break;
                case ADD_NEW_AD:
                    addAd();
                    break;
                case PRINT_MY_ALL_ADS:
                    adStorage.printMyAllAds(currentUser);
                    break;
                case PRINT_ALL_ADS:
                    adStorage.printAllAds();
                    break;
                case PRINT_AD_BY_CATEGORY:
                    printByCategory();
                    break;
                case DELETE_MY_ALL_ADS:
                    adStorage.deleteMyAllAds(currentUser);
                    break;
                case DELETE_AD_BY_TITLE:
                    deleteByTitle();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    private static void deleteByTitle() {
        adStorage.printMyAllAds(currentUser);
        System.out.println("Please input title");
        String title = scanner.nextLine();
        adStorage.deleteAdByTitle(title,currentUser);
    }

    private static void printByCategory() {
        System.out.println("please input Category");
        for (Category category : Category.values()) {
            System.out.print(category + ", ");
        }
        System.out.println();
        String categoryStr = scanner.nextLine();
        adStorage.printAdByCategory(Category.valueOf(categoryStr));
    }

    private static void addAd() {
        System.out.println("Please input title, text, price, category");
        for (Category value : Category.values()) {
            System.out.print(value + ", ");
        }
        System.out.println();
        String adStr = scanner.nextLine();
        String[] adStrArr = adStr.split(",");
        Ad ad = new Ad(adStrArr[0], adStrArr[1], Double.parseDouble(adStrArr[2]), new Date(),
                Category.valueOf(adStrArr[3]), currentUser);
        adStorage.addAD(ad);
    }
}
