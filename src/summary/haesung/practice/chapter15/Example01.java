package summary.haesung.practice.chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * <pre>
 * Date		: 2020. 6. 17.
 * Author 	: pureboyz
 * 
 * 커맨드라인으로 부터 파일명과 숫자를 입력받아서,
 * 입력받은 파일의 내용의 처음부터 입력받은 숫자만큼의 라인을 출력하는 프로그램(FileHead.java)을 작성하라.
 * [Hint] BufferedReader의 readLIne()을 사용하라.
 * </pre>
 */
public class Example01
{

	public static void main(String[] args)
	{
		String 	path 	= "src/summary/haesung/practice/chapter15/Example01.java";
		int 	lineNum = 50;
//		String 	path 	= args[0];
//		int 	lineNum = Integer.parseInt(args[1]);
		
		try
		{
			FileReader 		fr = new FileReader(path);
			BufferedReader 	br = new BufferedReader(fr);
			
			for(int i=0; i<lineNum; i++)
			{
				System.out.println(i+1 + " : " + br.readLine());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
