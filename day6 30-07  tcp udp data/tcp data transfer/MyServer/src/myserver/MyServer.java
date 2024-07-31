package myserver;

import java.util.*;
import java.io.*;
import java.net.*;

public class MyServer {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        int r, i = 0;
        int n = din.readInt();

        int a[] = new int[n];
        System.out.println("Data receved at the srever : ");
        int count = 0;
        for (i = 0; i < n; i++) {
            a[i] = din.readInt();
            System.out.println(a[i]);

        }
        int number = a.length;
        Arrays.sort(a);
        for (i = 0; i < n; i++) {
            dout.writeInt(a[i]);
        }
        s.close();
        ss.close();
    }

}
