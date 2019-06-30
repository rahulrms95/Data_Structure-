package com.socket.programming;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable,Message{

	Scanner sc = new Scanner(System.in);
	String serverip;
	int port;
	public Client(int port,String ip)
	{
		this.port = port;
		this.serverip = ip;
	}
	@Override
	public void run() {

		Thread.currentThread().setName("THREAD::Client");
		System.out.println(Thread.currentThread().getName()+" Thread Socket Client.....");
		connect();
	}

	
	@Override
	public void connect() {
		try {
			System.out.println("Client Socket Connecting to "+this.serverip+" ip .....");
			Socket sk = new Socket(this.serverip,this.port);
			//DataOutputStream out = new DataOutputStream(sk.getOutputStream());
			//DataInputStream in = new DataInputStream(sk.getInputStream());
			write(sk);
			read(sk);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@Override
	public void write(Socket sck) {
		
		new Thread(new MessageWriter("Client",sck)).start();
		
	}
	@Override
	public void read(Socket socket) {
		
		//new Thread(new MessageReader("Client",socket)).start();
	}
}
