package blog.storage;

import blog.model.Category;
import blog.model.Post;

import java.util.Scanner;

public class PostStorageImpl implements PostStorage {

    private Post[] posts = new Post[10];
    private int size;


    public void add(Post post) {
        if (size == posts.length) {
            extend();
        }
        posts[size++] = post;
    }

    private void extend() {
        Post[] tmp = new Post[posts.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = posts[i];

        }
        posts = tmp;
    }

    @Override
    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().contains(keyword)
                    || posts[i].getText().contains(keyword)) {
                System.out.println(posts[i]);
            }
        }
    }

    @Override
    public void getPostByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().contains(title)) {
                System.out.println(posts[i]);
            }
        }
    }

    @Override
    public void printPostsByCategory(String category) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().equals(Category.valueOf(category))) {
                System.out.println(posts[i]);
            }
        }
    }

    @Override
    public void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            posts[i - 1] = posts[i];
        }
        size--;
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equals(title)) {
                deleteByIndex(i);
            }
        }
    }

    @Override
    public void deleteByCategory(String category) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().name().equals(category)) {
                deleteByIndex(i);
            }
        }
    }

    @Override
    public String newChangePost(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equals(title)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please input text");
                posts[i].setText(scanner.nextLine());
                System.out.println("Please input category");
                posts[i].setCategory(Category.valueOf(scanner.nextLine().toUpperCase()));
                return posts[i].getText();
            }
        }
        return null;
    }

    @Override
    public void postPrint() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }
}
