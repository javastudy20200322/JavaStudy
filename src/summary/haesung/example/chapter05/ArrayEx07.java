package summary.haesung.example.chapter05;

public class ArrayEx07
{

	public static void main(String[] args)
	{
		String src = "ABCDE";
		
		for(int i=0; i<src.length(); i++)
		{
			// 문자열 src의 i번째 문자를 char 타입의 변수 ch에 저장.
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + ") : " + ch);
		}
		
		
		// 문자열 src를 char타입의 배열로 변환.
		char[] chArr = src.toCharArray();
		System.out.println(chArr);
	}
}
