
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LegacyFirewall firewall = new LegacyFirewall();
        SecurityLog security = new FirewallAdapter(firewall);
        CommandCenterFacade commandCenter = new CommandCenterFacade();

        System.out.print("Enter security event: ");
        String event = scanner.nextLine();

        System.out.print("Enter severity level: ");
        int severity = scanner.nextInt();

        security.logEvent(event);
        security.setSeverity(severity);

        System.out.println("\nChoose an action:");
        System.out.println("1. Lockdown");
        System.out.println("2. Lift Lockdown");
        System.out.println("3. Maintenance");

        int choice = scanner.nextInt();

        if (choice == 1) {
            commandCenter.initiateEmergencyLockdown();
        } else if (choice == 2) {
            commandCenter.liftEmergencyLockdown();
        } else if (choice == 3) {
            commandCenter.enableMaintenanceMode();
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
