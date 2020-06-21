package summary.haesung.example.chapter15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1
{

	public static void main(String[] args)
	{
		try
		{
			String 			fileName 	= "src/summary/haesung/example/chapter15/test.txt";
			FileInputStream fis 		= new FileInputStream(fileName);
			FileReader 		fr 			= new FileReader(fileName);
			
			int data = 0;
			
			// 바이트 기반의 FileInputStream은 한글이 깨진다.
			while((data = fis.read()) != -1)
			{
				System.out.print((char) data);
			}
			
			System.out.println();
			fis.close();
			
			// 문자 기반의 FileReader는 한글이 깨지지않는다.
			while((data = fr.read()) != -1)
			{
				System.out.print((char) data);
			}
			
			System.out.println();
			fr.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
