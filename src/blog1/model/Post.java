package blog1.model;

import java.util.Date;
import java.util.Objects;

public class Post {

    private String title;
    private String text;
    private Date createdDate;
    private Category category;
    private User author;

    public Post() {
    }

    public Post(String title, String text, Date createdDate, Category category, User author) {
        this.title = title;
        this.text = text;
        this.createdDate = createdDate;
        this.category = category;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(title, post.title) && Objects.equals(text, post.text) && Objects.equals(createdDate, post.createdDate) && category == post.category && Objects.equals(author, post.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, createdDate, category, author);
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", createdDate=" + createdDate +
                ", category=" + category +
                ", author=" + author +
                '}';
    }
}
