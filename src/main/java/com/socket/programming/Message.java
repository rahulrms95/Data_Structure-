package com.socket.programming;

import java.net.Socket;

public interface Message {

	public void write(Socket socket);
	public void read(Socket socket);
	public void connect();
}
