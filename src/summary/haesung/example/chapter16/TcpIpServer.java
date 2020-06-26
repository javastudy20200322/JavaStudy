package summary.haesung.example.chapter16;

import java.io.*;
import java.net.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TcpIpServer
{

	public static void main(String[] args)
	{
		ServerSocket serverSocket = null;
		
		try
		{
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + " 서버가 준비되었습니다.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		while(true)
		{
			try
			{
				System.out.println(getTime() + " 연결 요청을 기다립니다.");
				
//				serverSocket.setSoTimeout(5*1000);	// 5초동안 연결이 없으면 SocketTimeoutException이 발생한다.
				
				Socket socket = serverSocket.accept();	// 소켓을 생성하여 연결 요청이 들어올 때까지 멈추고 기다린다.
				System.out.println(getTime() + socket.getInetAddress() + "로 부터 연결요청이 들어왔습니다.");
				
				System.out.println(socket.getPort());		// 클라이언트의 포트
				System.out.println(socket.getLocalPort());	// 서버의 포트
				
				OutputStream 		os 	= socket.getOutputStream();
				DataOutputStream 	dos = new DataOutputStream(os);
				
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + " 데이터를 전송했습니다.");
				
				dos.close();
				socket.close();
			}
			catch(SocketTimeoutException e)
			{
				System.out.println("지정된 시간동안 접속이 없어 종료합니다.");
				System.exit(0);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	static String getTime()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
		return sdf.format(new Date());
	}

}
