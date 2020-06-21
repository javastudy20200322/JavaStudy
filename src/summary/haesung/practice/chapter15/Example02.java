package summary.haesung.practice.chapter15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * <pre>
 * Date		: 2020. 6. 17.
 * Author 	: pureboyz
 * 
 * 지정된 이진파일의 내용을 실행결과와 같이 16진수로 보여주는 프로그램(HexaViewer.java)을 작성하라.
 * [Hint] PrintStream과 printf()를 사용하라.
 * </pre>
 */
public class Example02
{

	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("src/summary/haesung/practice/chapter15/score.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			int data = 0;
			
			while((data = dis.read()) != -1)
			{
				System.out.printf("%02X", data);
				System.out.print(" ");
			}
			
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
