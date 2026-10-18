
import java.util.List;

public class UserAccessManager {

    public void lockUserAccounts(List<String> usernames) {
        for (String user : usernames) {
            System.out.println("Locking account: " + user);
        }
    }

    public void unlockUserAccounts(List<String> usernames) {
        for (String user : usernames) {
            System.out.println("Unlocking account: " + user);
        }
    }

    public void grantAdminAccess(String user) {
        System.out.println("Granting admin access to: " + user);
    }
}
