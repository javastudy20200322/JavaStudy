package summary.haesung.example.chapter16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx1
{

	public static void main(String[] args)
	{
		InetAddress 	ip 		= null;
		InetAddress[] 	ipArr 	= null;
		
		try
		{
			// 도메인으로 IP정보 가져오기
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString() : " + ip.toString());
			
			System.out.println();
			
			// local의 IP정보 가져오기
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString() : " + ip.toString());
			
			System.out.println();
			
			// 하나의 도메인에 여러 IP가 매핑되어있을때
			ipArr = InetAddress.getAllByName("www.naver.com");
			for(int i=0; i<ipArr.length; i++)
			{
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}
		}
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
	}

}
