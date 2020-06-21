package summary.haesung.practice.chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * <pre>
 * Date		: 2020. 6. 17.
 * Author 	: pureboyz
 * 
 * 커맨드라인으로 부터 여러 파일의 이름을 입력받고,
 * 이 파일들을 순서대로 합쳐서 새로운 파일을 만들어 내는 프로그램(FileMergeTest.java)을 작성하시오.
 * 단, 합칠 파일의 개수에는 제한을 두지 않는다.
 * </pre>
 */
public class Example04
{

	public static void main(String[] args)
	{
		Vector v = new Vector<>();
		
		try
		{
			for(int i=0; i<args.length; i++)
			{
				FileInputStream fis = new FileInputStream(args[i]);
				v.add(fis);
			}
			
			SequenceInputStream input 	= new SequenceInputStream(v.elements());
			FileOutputStream 	fos 	= new FileOutputStream("src/summary/haesung/practice/chapter15/result.txt");
			
			int data = 0;
			
			while((data = input.read()) != -1)
			{
				fos.write(data);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
