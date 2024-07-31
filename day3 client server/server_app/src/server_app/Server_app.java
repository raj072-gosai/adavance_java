/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_app;

import java.io.*;
import java.net.*;

/**
 *
 * @author Administrator
 */
public class Server_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ServerSocket ss= new ServerSocket(6543);
            Socket s =ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("message :-"+str);
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
