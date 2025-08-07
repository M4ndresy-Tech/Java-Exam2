import java.time.LocalDate;

public class User {
    String userId;
    String userName;
    String userEmail;
    LocalDate creationDate=LocalDate.now();

    public User(String userId, String userName, String userEmail, LocalDate creationDate) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.creationDate = creationDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
