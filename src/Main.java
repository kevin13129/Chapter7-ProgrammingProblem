
import java.util.List;

public class Main {
    public static void main(String[] args) {

        NetworkTrafficController network = new NetworkTrafficController();
        UserAccessManager users = new UserAccessManager();
        EncryptionService encryption = new EncryptionService();

        List<String> accounts = List.of(
                "admin_temp",
                "guest_user_1",
                "service_acct"
        );

        System.out.println("=== EMERGENCY BREACH ===");

        network.blockPort(8080);
        network.blockPort(443);
        users.lockUserAccounts(accounts);
        encryption.encryptDatabase("Customer_Records");
        network.divertTraffic();

        System.out.println("=== ALL CLEAR ===");

        network.unblockPort(8080);
        network.unblockPort(443);
        users.unlockUserAccounts(accounts);
        encryption.decryptDatabase("Customer_Records");
    }
}
