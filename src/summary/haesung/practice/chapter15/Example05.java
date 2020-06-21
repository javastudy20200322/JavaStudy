package summary.haesung.practice.chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * <pre>
 * Date 	: 2020. 6. 19.
 * Author	: pureboyz
 *
 * 다음은 FilterWriter를 상속받아서 직접 구현한 HtmlTagFilterWriter를 사용해서 주어진 파일에 있는 태그를 모두 제거하는 프로그램이다.
 * HtmlTagFilterWriter의write()가 태그를 제거하도록 코드를 완성하시오.
 * </pre>
 */
public class Example05
{

	public static void main(String[] args)
	{
//		if(args.length != 2)
//		{
//			System.out.println("USAGE: java Exercise15_5 TAGET_FILERESULT_FILE");
//			System.exit(0);
//		}
		
		String inputFile = "src/summary/haesung/practice/chapter15/test.txt";
		String outputFile = "src/summary/haesung/practice/chapter15/result.txt";
//		String inputFile = args[0];
//		String outputFile = args[1];
		
		try
		{
			BufferedReader 		input 	= new BufferedReader(new FileReader(inputFile));
			HtmlTagFilterWriter output 	= new HtmlTagFilterWriter(new FileWriter(outputFile));
			
			int ch = 0;
			
			while((ch=input.read())!=-1)
			{
				output.write(ch);
			}
			
			input.close();
			output.close();
		} catch(IOException e) {}
	}

}

class HtmlTagFilterWriter extends FilterWriter
{
	StringWriter 	tmp 	= new StringWriter();
	boolean 		inTag 	= false;
	
	HtmlTagFilterWriter(Writer out)
	{
		super(out);
	}
	
	public void write(int c) throws IOException
	{
		/*
		(1) 아래의 로직에 맞게 코드를 작성하시오.
		1. 출력할 문자(c)가 '<'이면 inTag의 값을 true로 한다.
		2. 출력할 문자(c)가 '>'이면 inTag의 값을 false로 한다.
		새로운 StringWriter를 생성한다.(기존 StringWriter의 내용을 버린다.)
		3. inTag의 값이 true이면, StringWriter에 문자(c)를 출력하고
		inTag의 값이 false이면, out에 문자(c)를 출력한다.
		[참고] 태그가 시작되면 StringWriter에 출력하고 태그가 끝나면 StringWriter는 비워진다.
		*/
		if(c == '<')
		{
			inTag = true;
			tmp.write(c);
		}
		else if(inTag)
		{
			tmp.write(c);
			
			if(c == '>')
			{
				inTag 	= false;
				tmp 	= new StringWriter();
			}
		}
		else
		{
			out.write(c);
		}
		
	}
	
	public void close() throws IOException
	{
		out.write(tmp.toString()); // StringWriter의 내용을 출력하고
		super.close(); // 조상의 close()를 호출해서 기반 스트림을 닫는다.
	}
	
}
