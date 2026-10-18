
public class NetworkTrafficController {

    public void blockPort(int port) {
        System.out.println("Blocking port: " + port);
    }

    public void unblockPort(int port) {
        System.out.println("Unblocking port: " + port);
    }

    public void divertTraffic() {
        System.out.println("Diverting traffic to honeypot");
    }

    public void monitorPacketLoss() {
        System.out.println("Monitoring packet loss");
    }
}
