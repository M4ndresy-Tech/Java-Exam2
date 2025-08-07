import java.time.LocalDate;

public class Posts {
    private String title;
    private String content;
    private User author;
    private LocalDate creationDate;

    public Posts(String title, String content, User author, LocalDate creationDate) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
