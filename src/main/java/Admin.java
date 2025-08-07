import java.time.LocalDate;

public class Admin extends Mediator {
    public Admin(String userId, String userName, String userEmail, LocalDate creationDate) {
        super(userId, userName, userEmail, creationDate);
    }
}
