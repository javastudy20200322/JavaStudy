package summary.haesung.example.chapter03;

public class OperatorEx11
{
	public static void main(String[] args)
	{
		// 원래 new를 사용해서 객체를 생성해야한다.
		String str1 = new String("abc");
		// String만 특별히 new를 사용하지 않고, 간단히 쓸 수 있게 허용한다.
		String str2 = "abc";
		
		System.out.println("abc" == "abc");
		
		// 값은 같지만 다른 객체이다.
		System.out.println(str1 == "abc");
		System.out.println(str2 == "abc");
		System.out.println(str1.equals("abc"));
		System.out.println(str2.equals("abc"));
		
		// 대소문자를 구별하므로 false
		System.out.println(str2.equals("ABC"));
		
		// equalsIgnoreCase()는 대소문자 구별없이 비교한다.
		System.out.println(str2.equalsIgnoreCase("ABC"));
	}
}
