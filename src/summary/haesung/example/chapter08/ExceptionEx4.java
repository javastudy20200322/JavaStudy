package summary.haesung.example.chapter08;

public class ExceptionEx4
{

	public static void main(String[] args)
	{
		try
		{
			// 생성자의 매개변수로 들어간 문자열이 Exception 인스턴스 메세지로 저장된다.
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;
			
//			throw new Exception("고의로 발생시켰음."); 	// 위랑 같은 코드.
		}
		catch (Exception e)
		{
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		
		// RuntimeException 클래스와 자손클래스들은 프로그래머의 실수로 발생하는 것들이라 예외처리를 하지 않아도 되도록 만들어졌다.
		throw new RuntimeException();
	}

}
