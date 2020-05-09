package summary.haesung.example.chapter08;

public class ExceptionEx2
{

	public static void main(String[] args)
	{
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++)
		{
			try
			{
				result = number / (int) (Math.random()*10);
//				result = number / 0;	// 정수를 0으로 나누는 것이 금지되어있기 때문에 Exception이 발생한다.
				System.out.println(result);
			}
			catch (ArithmeticException e)
			{
				// ArithmeticException이 발생하면 실행된다.
				System.out.println("0");
			}
		}
	}

}
