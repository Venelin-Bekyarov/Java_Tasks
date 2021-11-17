import java.util.Scanner;

public class C13_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        int protocolIndex = url.indexOf(':');
        String protocol = url.substring(0, protocolIndex);
        int serverIndex = url.indexOf('/', protocolIndex + 3);
        String server = url.substring(protocolIndex + 3, serverIndex - protocolIndex + 4);
        String resource = url.substring(serverIndex + 1);
        System.out.printf("[protocol]= \"%s\"%n", protocol);
        System.out.printf("[server]= \"%s\"%n", server);
        System.out.printf("[resource]= \"%s\"%n", resource);
    }
}
