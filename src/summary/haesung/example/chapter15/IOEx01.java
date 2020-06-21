package summary.haesung.example.chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx01
{

	public static void main(String[] args)
	{
		byte[] inSrc 	= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc 	= null;
		
		ByteArrayInputStream 	input 	= null;
		ByteArrayOutputStream 	output 	= null;
		
		input 	= new ByteArrayInputStream(inSrc);	// InputStream에 데이터를 담고
		output 	= new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read()) != -1)
		{
			output.write(data);	// InputStream에 담긴 데이터를 OutputStream으로 옮기고
		}
		
		outSrc = output.toByteArray();	// OutputStream에 담긴 데이터를 outSrc에 저장
		
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}

}
