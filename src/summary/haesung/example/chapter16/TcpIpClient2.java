package summary.haesung.example.chapter16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TcpIpClient2
{

	public static void main(String[] args)
	{
		try
		{
			String serverIp = "127.0.0.1";
			
			System.out.println("서버에 연결중입니다. 서버IP : " + serverIp);
			
			Socket socket = new Socket(serverIp, 7777);
			
			System.out.println("서버에 연결 완료.");
			
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
