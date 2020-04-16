package summary.haesung.practice.chapter06.example22;

public class Example22
{

	public static void main(String[] args)
	{
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
	
	
	
	public static boolean isNumber(String str)
	{
		boolean result = true;
		
		if(str.equals("") || str == null)
		{
			return false;
		}
		
		for(int i=0; i<str.length(); i++)
		{
			if((str.charAt(i) < 48) || (57 < str.charAt(i)))
			{
				result = false;
			}
		}
		
		return result;
	}

}
