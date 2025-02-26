
package clientchat;
import java.io.*;
import java.net.*;
public class ClientChat {


    public static void main(String[] args) {
        // TODO code application logic here
        try{
            InetAddress host = InetAddress.getLocalHost();
            System.out.println(host.getHostName());
            Socket soc= new Socket(host.getHostName(),5600);
            DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
            DataInputStream dis = new DataInputStream(System.in);
            String line = "";
            
            while(!line.equals("bye"))
            {
                try{
                    line= dis.readLine();
                    dos.writeUTF(line);
                    dos.close();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            dis.close();
            dos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }   
}
