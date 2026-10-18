
public class LegacyFirewall {

    public void recordActivity(String msg) {
        System.out.println("Firewall Log: " + msg);
    }

    public void setAlertLevel(int level) {
        System.out.println("Firewall Alert Level: " + level);
    }
}
