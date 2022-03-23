package blog.storage;


import blog.model.Post;

public interface PostStorage {

    void add(Post post);

    void searchByTitle(String keyword);

    void getPostByTitle(String title);

    void printPostsByCategory(String category);

    void deleteByIndex(int index);

    void deleteByTitle(String title);

    void deleteByCategory(String category);

    String newChangePost(String title);

    void postPrint();
}
