package myclient;

import java.io.*;
import java.net.*;
import java.util.*;

public class MyClient {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6666);
        System.out.println("Enter the array size : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("enter thr element of array : ");
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeInt(n);
        for (int i = 0; i < n; i++) {
            int r= scanner.nextInt();
            dout.writeInt(r);
        }
        DataInputStream din = new DataInputStream(s.getInputStream());
        int r;
        System.out.println("Sorted Array : ");
        for(int i=0;i<n;i++){
            r=din.readInt();
            System.out.print(r+" ");
        }
        s.close();
    }

}
