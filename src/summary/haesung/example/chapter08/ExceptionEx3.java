package summary.haesung.example.chapter08;

public class ExceptionEx3
{

	public static void main(String[] args)
	{
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(0/0);	// ArithmeticException 발생
			System.out.println(4);
		}
		// ArithmeticException이 발생했을 때 실행
		catch (ArithmeticException ae)
		{
			if(ae instanceof ArithmeticException)
			{
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
			
			// ArithmeticException인스턴스에 접근하여
			// 예외발생 당시의 호출스택에 있던 메서드의 정보와 예외메세지를 화면에 출력한다.
			ae.printStackTrace();
			
			// 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.
			System.out.println("예외메세지 : " + ae.getMessage());
		}
		// ArithmeticException을 제외한 모든 Exception이 발생했을 때 실행
		catch (Exception e)
		{
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
