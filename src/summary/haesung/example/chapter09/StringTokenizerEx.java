package summary.haesung.example.chapter09;

import java.util.StringTokenizer;

public class StringTokenizerEx
{

	public static void main(String[] args)
	{
		String 			source 	= "100,200,300,400";
//		StringTokenizer st 		= new StringTokenizer(source, ",");			// ','를 구분자로 문자열을 나눈다.
		StringTokenizer st 		= new StringTokenizer(source, ",", true);	// 구분자도  토큰으로 간주.
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

		System.out.println();
		
		String 			data 	= "100,,,200,300";
		String[] 		result 	= data.split(",");
		StringTokenizer st1 	= new StringTokenizer(data, ",");

		// split은 빈 문자열도 토큰으로 인식한다.
		for(int i=0; i<result.length; i++)
		{
			System.out.print(result[i] + "|");
		}
		System.out.println();
		// StringTokenizer는 빈문자열은 토큰으로 인식하지 않는다.
		while(st1.hasMoreTokens())
		{
			System.out.print(st1.nextToken());
		}
	}

}
