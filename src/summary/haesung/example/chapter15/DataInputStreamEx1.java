package summary.haesung.example.chapter15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1
{

	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("src/summary/haesung/example/chapter15/sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			// 여러가지 자료형으로 출력한 경우, 출력한 순서대로 읽어야한다.
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			
			dis.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
