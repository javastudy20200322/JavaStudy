package summary.haesung.example.chapter15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx2
{

	public static void main(String[] args)
	{
		int sum 	= 0;
		int score 	= 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("src/summary/haesung/example/chapter15/score.dat");
			dis = new DataInputStream(fis);
			
			while(true)
			{
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}
		// 더이상 읽어올 int타입의 값이 없으면 EOFException이 발생하고 총합을 출력.
		catch (EOFException e)
		{
			System.out.println("점수의 총합은 : " + sum + "입니다.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(dis != null)
				{
					dis.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
