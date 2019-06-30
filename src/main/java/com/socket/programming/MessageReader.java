package com.socket.programming;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MessageReader implements Runnable{

	Socket socket;
	DataOutputStream out;
	DataInputStream in ;
	String reader;
	public MessageReader(String reader,Socket socket) {
		this.reader = reader;
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

		Thread.currentThread().setName("THREAD::Reader"+reader);
		System.out.println(Thread.currentThread().getName()+" thread starting ...");
		readMsg();
	}

	public void readMsg()
	{
		try {
			//System.out.println(reader+ " reading msg -> "+in.readUTF());
			System.out.println(in.readUTF());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
