package summary.haesung.example.chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx03
{

	public static void main(String[] args)
	{
		byte[] inSrc 	= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc 	= null;
		byte[] temp 	= new byte[4];
		
		ByteArrayInputStream 	input 	= null;
		ByteArrayOutputStream 	output 	= null;
		
		input 	= new ByteArrayInputStream(inSrc);
		output 	= new ByteArrayOutputStream();
		
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		
		// available()은 blocking없이 읽어 올 수 있는 바이트의 수를 반환한다.
		while(input.available() > 0)
		{
			// 남은 데이터의 바이트 수
			System.out.println("input.available() : " + input.available());
			try
			{
				// 4byte씩 읽는다.
				int len = input.read(temp);	// 읽어 온 데이터의 갯수를 반환한다.
				System.out.println("len : " + len);
				
				// 두 개가 같은 역할을 한다.
//				output.write(temp);
				output.write(temp, 0, len);
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	static void printArrays(byte[] temp, byte[] outSrc)
	{
		System.out.println("temp          : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}

}
