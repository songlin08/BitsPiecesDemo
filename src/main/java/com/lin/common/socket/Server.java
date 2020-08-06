package com.lin.common.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket ss;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public Server(){
        try {
            ss = new ServerSocket(10000);
            System.out.println("服务端启动");
            while(true){
                socket = ss.accept();
                String RemoteIP = socket.getInetAddress().getHostAddress();
                String RemotePort = ":" + socket.getLocalPort();
                System.out.println("客户端来了! IP : " + RemoteIP + RemotePort);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line = in.readLine();
                System.out.println("来自客户端:" + line);
                out = new PrintWriter(socket.getOutputStream(), true);
                out.print("Your Message Received!");
                out.close();
                in.close();
                socket.close();
            }
        } catch (IOException e) {
            out.println("wrong");
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
