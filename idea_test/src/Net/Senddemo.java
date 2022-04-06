package Net;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Senddemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        byte[] b="hello,UDP".getBytes();
        DatagramPacket dp=new DatagramPacket(b,b.length, InetAddress.getByName("127.0.0.1"),10086);
        ds.send(dp);
        ds.close();
    }
}
