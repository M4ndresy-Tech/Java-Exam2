import java.time.LocalDate;

public class StandardUser extends User {
    public StandardUser(String userId, String userName, String userEmail, LocalDate creationDate) {
        super(userId, userName, userEmail, creationDate);
    }

}
