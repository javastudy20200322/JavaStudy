package summary.haesung.example.chapter16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TcpIpClient
{

	public static void main(String[] args)
	{
		try
		{
			String serverIp = "127.0.0.1";
			
			System.out.println("서버에 연결중입니다. 서버IP : " + serverIp);
			
			Socket socket = new Socket(serverIp, 7777);	// 소켓이 생성되면 자동으로 127.0.0.1:7777로 연결 요청을 한다.
			
			InputStream 	is 	= socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			dis.close();
			socket.close();
			
			System.out.println("연결이 종료되었습니다.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
