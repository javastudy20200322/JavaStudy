package summary.haesung.example.chapter15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConversion
{

	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("src/summary/haesung/example/chapter15/FileConversion.java");
			FileWriter fw = new FileWriter("src/summary/haesung/example/chapter15/FileConversion.txt");
			
			int data = 0;
			
			// FileConversion.java를 읽어서 공백을 모두 없애고 FileConversion.txt에 쓴다.
			while((data = fr.read()) != -1)
			{
				if((data != '\t') && (data != '\n') && (data != ' ') && (data != '\r'))
				{
					fw.write(data);
				}
			}
			
			fr.close();
			fw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
