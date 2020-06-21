package summary.haesung.example.chapter15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1
{

	public static void main(String[] args)
	{
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try
		{
			fos = new FileOutputStream("src/summary/haesung/example/chapter15/sample.dat");
			dos = new DataOutputStream(fos);
			
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
