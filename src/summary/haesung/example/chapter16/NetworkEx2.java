package summary.haesung.example.chapter16;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class NetworkEx2
{

	public static void main(String[] args)
	{
		try
		{
			URL url = new URL("http://www.codechobo.com:80/sample/hello.html?referer=codechobo#index1");
			
			System.out.println(url.getAuthority());
//			System.out.println(url.getContent());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
			System.out.println(url.getHost());
			System.out.println(url.getPath());
			System.out.println(url.getProtocol());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
			System.out.println(url.getUserInfo());
			System.out.println(url.toExternalForm());
			System.out.println(url.toURI());
		}
		catch (IOException | URISyntaxException e)
		{
			e.printStackTrace();
		}
	}

}
