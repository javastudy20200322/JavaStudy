package summary.haesung.example.chapter06;

public class VarArgsEx
{

	public static void main(String[] args)
	{
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}
	
	// 가변인자 사용. 가변인자는 매개변수 중에서 제일 마지막에 사용해야한다.
	static String concatenate(String delim, String... args)
	{
		String result = "";
		
		for(String str : args)
		{
			result += str + delim;
		}
		
		return result;
	}

}
