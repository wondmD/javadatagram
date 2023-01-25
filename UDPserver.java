import java.io.*;
import java.net.*;
public class UDPserver{
    public static viod main(String[] args)throws IOException{
        DatagramSocket server = new DatagramPacket(4160);
        byte[] bufr = new byte[256];
        DatagramPacket packet = new DatagramPacket(bufr,bufr.legnth);
        server.recieve(packet);
        String responce = new String(packet.getData());
        System.out.print("Responce data is :" + responce);
        server.close();
    }
}