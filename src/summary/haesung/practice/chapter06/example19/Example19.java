package summary.haesung.practice.chapter06.example19;

public class Example19
{

	public static void main(String[] args)
	{
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change : " + str);
	}
	
	// 매개변수 str은 지역변수이므로 메소드가 종료되면 사라진다.
	// "456"이 더해진 str 변수는 사라져 버려서 System.out.println("After change : " + str); 에는 "456"이 붙어있지 않다.
	public static void change(String str)
	{
		str += "456";
	}

}
