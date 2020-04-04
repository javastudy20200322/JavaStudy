package summary.haesung.example.chapter03;

public class OperatorEx6
{
	public static void main(String[] args)
	{
		char a = 'a';
		char b = 'b';
		
		// char 타입의 연산은 유니코드 값으로 이루어진다.
		System.out.println((int) a);
		System.out.println((int) b);
		System.out.println(a + b);
	}
}
