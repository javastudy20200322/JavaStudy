package summary.haesung.example.chapter08;

public class ExceptionEx8
{

	public static void main(String[] args)
	{
		try
		{
			method1(); // 종료되면서 예외가 발생하므로 catch문이 실행된다.
		}
		catch (Exception e)
		{
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}
	
	static void method1() throws Exception
	{
		try
		{
			throw new Exception(); // 요놈 때문에 catch문이 실행된다.
		}
		catch (Exception e)
		{
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e; // 요놈 때문에 예외가 발생하면서 method1()이 종료된다.
		}
	}
}
