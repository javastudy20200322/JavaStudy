package summary.haesung.example.chapter15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx3
{

	public static void main(String[] args)
	{
		int[] score = {100, 90, 95, 85, 50};
		
		try
		{
			FileOutputStream fos = new FileOutputStream("src/summary/haesung/example/chapter15/score.dat");
			DataOutputStream dos = new DataOutputStream(fos);	// DataOutputStream은 이진데이터로 출력한다.
			
			for(int i=0; i<score.length; i++)
			{
				dos.writeInt(score[i]);
			}
			
			dos.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
