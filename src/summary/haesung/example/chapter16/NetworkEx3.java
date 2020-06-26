package summary.haesung.example.chapter16;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3
{

	public static void main(String[] args)
	{
		URL 	url 	= null;
		String 	address = "http://www.codechobo.com:80/sample/hello.html";
		
		try
		{
			url = new URL(address);
			
			URLConnection conn = url.openConnection();

			System.out.println("conn.toString() : " + conn);
			System.out.println("conn.getAllowUserInteraction() : " + conn.getAllowUserInteraction());
			System.out.println("conn.getConnectTimeout() : " + conn.getConnectTimeout());
//			System.out.println("conn.getContent() : " + conn.getContent());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
