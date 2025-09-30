import java.net.*;

public class DReceiver {
    public static void main(String[] args) throws Exception {
        // Create a DatagramSocket to listen on port 3000
        DatagramSocket ds = new DatagramSocket(3000);

        // Create a byte array buffer to store the incoming data
        byte[] buffer = new byte[1024];

        // Create a DatagramPacket to receive the data
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

        System.out.println("Receiver is running... Waiting for packet.");

        // Receive the packet (blocking call)
        ds.receive(dp);

        // Extract data from packet
        String receivedData = new String(dp.getData(), 0, dp.getLength());

        // Print the received message
        System.out.println("Received message: " + receivedData);

        // Close the socket
        ds.close();
    }
}
