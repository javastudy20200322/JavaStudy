package summary.haesung.example.chapter09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx
{

	public static void main(String[] args)
	{
		String[] data = {
				"bat", "baby", "bonus",
				"cA", "ca", "co", "c.", "c0",
				"cat", "combat", "count", "date", "disc"};
		
		// c로 시작하는 소문자 영단어
		Pattern p  = Pattern.compile("c[a-z]*");
		// b 또는 c로 시작하는 단어
		Pattern p1  = Pattern.compile("[b|c].*");
		
		for(int i=0; i<data.length; i++)
		{
			Matcher m = p1.matcher(data[i]);
			
			if(m.matches())
			{
				System.out.println(data[i] + ",");
			}
		}
		
		System.out.println();
		
		String source 	= "HP:011-1111-1111, HOME:02-999-9999";
		String pattern 	= "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";	// 정규식의 일부를 괄호로 묶으면 그룹화를 할 수 있다.
		
		Pattern p2 = Pattern.compile(pattern);
		Matcher m2 = p2.matcher(source);
		
		int i=0;
		while(m2.find())
		{
			System.out.println(++i + ": " + m2.group() + " -> " + m2.group(1) + ", " + m2.group(2) + ", " + m2.group(3));
		}
		
		System.out.println();
		
		String source3 		= "A broken hand works, but not a broken heart.";
		String pattern3 	= "broken";
		
		StringBuffer sb = new StringBuffer();
		
		Pattern p3 = Pattern.compile(pattern3);
		Matcher m3 = p3.matcher(source3);
		
		int j=0;
		while(m3.find())
		{
			// 매칭되는 부분의 시작과 끝을 알 수 있다.
			System.out.println(++j + "번째 매칭: " + m3.start() + "~" + m3.end());
			
			// 매칭되는 부분을 replace한다.
			m3.appendReplacement(sb, "drunken");
		}
		
		// 매칭된 부분 이후의 문자열을 붙인다.
		m3.appendTail(sb);
		
		System.out.println("Replacement count : " + j);
		System.out.println("result : " + sb.toString());
	}

}
