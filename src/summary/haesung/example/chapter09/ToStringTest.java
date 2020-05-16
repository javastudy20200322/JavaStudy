package summary.haesung.example.chapter09;

public class ToStringTest
{

	public static void main(String[] args)
	{
		// 아래 두 클래스는 객체의 내용을 반환하도록 toString()이 오버라이딩 되어있다.
		String 			str 	= new String("KOREA");
		java.util.Date 	today 	= new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}

}
