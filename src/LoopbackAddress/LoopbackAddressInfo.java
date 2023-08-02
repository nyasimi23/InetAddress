package LoopbackAddress;

import java.net.InetAddress;

public class LoopbackAddressInfo {

    public static void main(String[] args) {
        InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
        System.out.println("Loopback Address: " + loopbackAddress.getHostAddress());
    }
}
