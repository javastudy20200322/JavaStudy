package summary.haesung.practice.chapter09.example10;

import java.util.Arrays;

/**
 * <pre>
 * Date		: 2020. 5. 16.
 * Author 	: pureboyz
 * 
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 
 * 메서드명 : format
 * 기 능 : 주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다.
 * 반환타입 : 	String
 * 매개변수 : 	String str - 변환할 문자열
 * 			int length - 변환된 문자열의 길이
 * 			int alignment - 변환된 문자열의 정렬조건
 * 			(0:왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)
 * </pre>
 */
public class Example10
{

	public static void main(String[] args)
	{
		String str = "가나다";
		
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
	}
	
//	주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다.
//	
//	1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
//	2. 1의 경우가 아니면, length크기의 char배열을 생성하고 공백으로 채운다.
//	3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다. (System.arraycopy()사용)
//	4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다.
	public static String format(String str, int length, int alignment)
	{
		StringBuffer sb = new StringBuffer();
		
		if(length < str.length())
		{
			return str.substring(0, length);
		}
		else
		{
			char[] 	strArr 	= str.toCharArray();
			char[] 	charArr = new char[length];	// 자동으로 빈 값으로 채워져있다.
			
			if(alignment == 0)
			{
				System.arraycopy(strArr, 0, charArr, 0, strArr.length);
			}
			else if(alignment == 1)
			{
				System.arraycopy(strArr, 0, charArr, (charArr.length-strArr.length) / 2, strArr.length);
			}
			else if(alignment == 2)
			{
				System.arraycopy(strArr, 0, charArr, charArr.length-strArr.length, strArr.length);
			}
			
			for(char ch : charArr)
			{
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}

}
