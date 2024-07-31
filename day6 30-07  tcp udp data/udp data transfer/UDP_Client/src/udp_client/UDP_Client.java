package udp_client;
import java.net.*;
import java.util.*;

public class UDP_Client {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int size = sca.nextInt();
        System.out.println("Enter the input array : ");
        StringBuilder arr = new StringBuilder();
        for(int i =0;i<size;i++){
            arr.append(sca.nextInt());
            arr.append(" ");
        }
        sca.close();
        String str = arr.toString();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        DatagramPacket sorted = new DatagramPacket(new byte[1024],1024);
        ds.receive(sorted);
        String res = new String(sorted.getData());
        System.out.println("Data Recived : "+res);
        ds.close();
    }
    
}
