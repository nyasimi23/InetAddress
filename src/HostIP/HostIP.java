package HostIP;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HostIP {

    public static void main(String[]args)throws UnknownHostException {
        String Hostname;
        try (Scanner stdin = new Scanner(System.in)) {
            InetAddress address;
            System.out.print("Enter a hostname:");
            Hostname = stdin.nextLine();
            address = InetAddress.getByName(Hostname);
            System.out.println("In the IP address for the host: " + Hostname + " is:  " + address.toString());
        }
    }
}
