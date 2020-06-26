package summary.haesung.example.chapter16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx4
{

	public static void main(String[] args)
	{
		URL 				url 	= null;
		InputStream 		is 		= null;
		FileOutputStream 	fos 	= null;
		String 				address = "http://www.codechobo.com/book/src/javajungsuk3_src.zip";
		
		int ch = 0;
		
		try
		{
			url = new URL(address);
			is 	= url.openStream();
			fos = new FileOutputStream("javajungsuk3_src.zip");
			
			while((ch=is.read()) != -1)
			{
				fos.write(ch);
			}
			
			is.close();
			fos.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
