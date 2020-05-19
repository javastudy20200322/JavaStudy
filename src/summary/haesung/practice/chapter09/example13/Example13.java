package summary.haesung.practice.chapter09.example13;

/**
 * <pre>
 * Date		: 2020. 5. 16.
 * Author 	: pureboyz
 * 
 * 다음은 하나의 긴 문자열(source) 중에서 특정 문자열과 일치하는 문자열의 개수를 구하는 예제이다.
 * 빈 곳을 채워 예제를 완성하시오.
 * </pre>
 */
public class Example13
{

	public static void main(String[] args)
	{
		String src = "aabbccAABBCCaa";
		
		System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
	}
	
	static int stringCount(String src, String key)
	{
		return stringCount(src, key, 0);
	}
	
	// pos는 검색을 시작할 index번호
	static int stringCount(String src, String key, int pos)
	{
		int count = 0;
		int index = 0;
		
		if((key == null) || (key.length() == 0))
		{
			return 0;
		}
		
		// code start..
		while(true)
		{
			index = src.indexOf(key, pos);
			if(index < 0)
			{
				break;
			}
			else
			{
				count++;
				pos = index + key.length();
			}
		}
		// code end..
		
		return count;
	}

}
