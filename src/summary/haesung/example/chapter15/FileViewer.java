package summary.haesung.example.chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileViewer
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream 	fis 	= new FileInputStream("src/summary/haesung/example/chapter15/FileViewer.java");
		FileOutputStream 	fos 	= new FileOutputStream("src/summary/haesung/example/chapter15/FileViewer.bak");
		int 				data 	= 0;
		
		while((data = fis.read()) != -1)
		{
//			char c = (char) data;
//			System.out.print(c);
			fos.write(data);
		}
		
		fis.close();
		fos.close();
	}

}
