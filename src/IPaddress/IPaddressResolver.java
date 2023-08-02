package IPaddress;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPaddressResolver {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a URL: ");
            String url = scanner.nextLine();

            try {
                InetAddress address = InetAddress.getByName(url);
                System.out.println("IP Address: " + address.getHostAddress());
            } catch (UnknownHostException e) {
                System.out.println("Unable to resolve the IP address for the provided URL.");
            }
        }
    }
}
