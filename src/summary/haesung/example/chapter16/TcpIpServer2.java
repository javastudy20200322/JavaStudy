package summary.haesung.example.chapter16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpServer2
{

	public static void main(String[] args)
	{
		ServerSocket 	serverSocket 	= null;
		Socket 			socket 			= null;
		
		try
		{
			serverSocket = new ServerSocket(7777);
			System.out.println("서버 준비 완료.");
			
			socket = serverSocket.accept();
			
			Sender 		sender 		= new Sender(socket);
			Receiver 	receiver 	= new Receiver(socket);
			
			sender.start();
			receiver.start();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}

class Sender extends Thread
{
	Socket 				socket;
	DataOutputStream 	dos;
	String 				name;
	
	Sender(Socket socket)
	{
		this.socket = socket;
		try
		{
			dos 	= new DataOutputStream(socket.getOutputStream());
			name 	= "[" + socket.getInetAddress() + " : " + socket.getPort() + "]";
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		while(dos != null)
		{
			try
			{
				dos.writeUTF(name + scanner.nextLine());
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Receiver extends Thread
{
	Socket 			socket;
	DataInputStream dis;
	
	Receiver(Socket socket)
	{
		this.socket = socket;
		try
		{
			dis = new DataInputStream(socket.getInputStream());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		while(dis != null)
		{
			try
			{
				System.out.println(dis.readUTF());
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
