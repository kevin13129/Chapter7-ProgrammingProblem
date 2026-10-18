
import java.util.List;

public class CommandCenterFacade {

    private NetworkTrafficController network = new NetworkTrafficController();
    private UserAccessManager users = new UserAccessManager();
    private EncryptionService encryption = new EncryptionService();

    private List<String> accounts = List.of(
            "admin_temp", "guest_user_1", "service_acct"
    );

    public void initiateEmergencyLockdown() {
        System.out.println("=== EMERGENCY LOCKDOWN ===");
        network.blockPort(8080);
        network.blockPort(443);
        users.lockUserAccounts(accounts);
        encryption.encryptDatabase("Customer_Records");
    }

    public void liftEmergencyLockdown() {
        System.out.println("=== ALL CLEAR ===");
        network.unblockPort(8080);
        network.unblockPort(443);
        users.unlockUserAccounts(accounts);
        encryption.decryptDatabase("Customer_Records");
    }

    public void enableMaintenanceMode() {
        System.out.println("=== MAINTENANCE MODE ===");
        network.divertTraffic();
        users.grantAdminAccess("security_admin");
        encryption.verifyIntegrity();
    }
}
