package summary.haesung.example.chapter08;

public class ExceptionEx5
{

	public static void main(String[] args)
	{
//		try
//		{
//			method1();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		
		method2();
	}
	
	static void method1() throws Exception
	{
		throw new Exception();
	}
	
	static void method2()
	{
		try
		{
			throw new Exception();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
