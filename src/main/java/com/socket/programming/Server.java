package com.socket.programming;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable,Message{

	int port;
	public Server(int port)
	{
		this.port = port;
	}
	
	@Override
	public void connect() {
		ServerSocket server = null;
		Socket socket;
		DataInputStream in=null;
		DataOutputStream out = null;
		try 
		{
			System.out.println("Starting Socket Server.....");
			server = new ServerSocket(port);
			socket = server.accept();
			System.out.println("Socket Connected...");
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream())); 
			out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			while(true)
			{
			System.out.println(in.readUTF());
			}
			//write(socket);
			
			//read(socket);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void write(Socket socket) {
		
		//new Thread(new MessageWriter("Server",socket)).start();
	}
	@Override
	public void read(Socket socket) {

		new Thread(new MessageReader("Server",socket)).start();
	}

	@Override
	public void run() {

		Thread.currentThread().setName("THREAD::Server");
		System.out.println(Thread.currentThread().getName()+" Thread Socket Server.....");
		connect();
	}

}
