import java.net.*;

public class DSender {
    public static void main(String[] args) throws Exception {
        // Create a DatagramSocket to send the data
        DatagramSocket ds = new DatagramSocket();

        // Message to be sent
        String str = "Welcome java";

        // IP address of the receiver (localhost)
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        // Convert the message to bytes
        byte[] buf = str.getBytes();

        // Create the datagram packet with message, length, IP address, and port number
        DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, 3000);

        // Send the packet
        ds.send(dp);

        // Close the socket
        ds.close();

        System.out.println("Packet sent successfully.");
    }
}
