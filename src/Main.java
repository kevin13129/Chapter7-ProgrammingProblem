
public class Main {
    public static void main(String[] args) {

        LegacyFirewall oldFirewall = new LegacyFirewall();

        SecurityLog security = new FirewallAdapter(oldFirewall);

        security.logEvent("Suspicious login detected");
        security.setSeverity(3);
    }
}
