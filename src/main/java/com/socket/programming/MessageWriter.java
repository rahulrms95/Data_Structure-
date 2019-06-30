package com.socket.programming;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MessageWriter implements Runnable{

	Socket socket;
	DataOutputStream out;
	DataInputStream in ;
	String msg;
	String writer;
	
	public MessageWriter(String writer,Socket socket) {
		this.writer = writer;
		this.socket = socket;
		try {
			this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			this.out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Override
	public void run() {

		Thread.currentThread().setName("THREAD::writer"+writer);
		System.out.println(Thread.currentThread().getName()+" thread starting ...");
		writeMsg();
	}
	public void writeMsg()
	{
		while(true)
		{
			System.out.println(this.writer+ " enter your message here.. ");
			try {
				msg = in.readLine();
				out.writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
