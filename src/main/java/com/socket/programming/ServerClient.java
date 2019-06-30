package com.socket.programming;

public class ServerClient {


	public static void main(String[] args) {

		ServerClient sc = new ServerClient();
		int port = 3465;
		String ip = "127.0.0.1";
		boolean server = false;
		if(server)
		{
			sc.startServer(port);
		}
		else
		{
			sc.startClient(ip, port);
		}
	}

	public void startServer(int port)
	{
		new Thread(new Server(port)).start();
	}

	public void startClient(String ip,int port)
	{
		new Thread(new Client(port, ip)).start();
	}
}
