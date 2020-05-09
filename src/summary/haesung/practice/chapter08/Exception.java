package summary.haesung.practice.chapter08;

import java.util.Scanner;

public class Exception
{

	public static void main(String[] args)
	{
		Example09();
	}
	
	static void Example01()
	{
		// 예외처리의 정의와 목적에 대해서 설명하시오.
		
		// 정의 : 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것.
		// 목적 : 컴파일 후 프로그램이 실행중일 때 예외가 발생하게 되어 프로그램이 비정상적으로 종료되는 것을 막기위해서 예외를 처리한다.
	}
	
	static void Example02()
	{
//		다음은 실행도중 예외가 발생하여 화면에 출력된 내용이다. 이에 대한 설명 중 옳지 않은 것은?
		
//		java.lang.ArithmeticException : / by zero
//			at ExceptionEx18.method2(ExceptionEx18.java:12)
//			at ExceptionEx18.method1(ExceptionEx18.java:8)
//			at ExceptionEx18.main(ExceptionEx18.java:4)
		
//		a. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알 수 있다.
//		b. 예외가 발생한 위치는 method2 메서드이며, ExceptionEx18.java파일의 12번째 줄이다.
//		c. 발생한 예외는 ArithmeticException이며, 0으로 나누어서 예외가 발생했다.
//		d. method2메서드가 method1메서드를 호출하였고 그 위치는 ExceptionEx18.java파일의 8번째 줄이다.
		
		
//		정답 : d
//		method1메서드가 method2메서드를 호출하였다.
	}
	
	static void Example03()
	{
//		다음 중 오버라이딩이 잘못된 것은?
		
//		void add(int a, int b) throws InvalidNumberException, NotANumberException {}
//		
//		class NumberException extends Exception {}
//		class InvalidNumberException extends NumberException {}
//		class NotANumberException extends NumberException {}
		
//		a. void add(int a, int b) throws InvalidNumberException, NotANumberException {}
//		b. void add(int a, int b) throws InvalidNumberException {}
//		c. void add(int a, int b) throws NotANumberException {}
//		d. void add(int a, int b) throws Exception {}
//		e. void add(int a, int b) throws NumberException {}
		
//		정답 : d,e
//		InvalidNumberException, NotANumberException이 아닌 다른 예외처리를 하는 메소드는 올바른 오버라이딩이 아니다.
	}
	
	static void Example04()
	{
//		다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은?
		
//		void method() throws InvalidNumberException, NotANumberException {}
//		
//		class NumberException extends RuntimeException {}
//		class InvalidNumberException extends NumberException {}
//		class NotANumberException extends NumberException {}
		
//		a. try {method();} catch(Exception e) {}
//		b. try {method();} catch(NumberException e) {} catch(Exception e) {}
//		c. try {method();} catch(Exception e) {} catch(NumberException e) {}
//		d. try {method();} catch(InvalidNumberException e) {} catch(NotANumberException e) {}
//		e. try {method();} catch(NumberException e) {}
//		f. try {method();} catch(RuntimeException e) {}
		
//		정답 : c
//		Exception으로 예외처리를 하면 모든 예외를 처리할 수 있는데 NumberException으로 예외처리를 하는 catch문이 더 추가되어서.
	}
	
	static void Example05()
	{
//		아래의 코드가 수행되었을 때의 실행결과를 적으시오.
		
		method(true);
		method(false);
		
//		정답
//		1
//		3
//		5
//		1
//		2
//		5
//		6
	}
	
	static void method(boolean b)
	{
		try
		{
			System.out.println(1);
			if(b)
			{
				throw new ArithmeticException();
			}
			System.out.println(2);
		}
		catch(RuntimeException r)
		{
			System.out.println(3);
			return;
		}
//		catch(Exception e)
//		{
//			System.out.println(4);
//			return;
//		}
		finally
		{
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	static void Example06()
	{
//		아래의 코드가 수행되었을 때의 실행결과를 적으시오.
		
//		try
//		{
			method1();
//		}
//		catch(Exception e)
//		{
//			System.out.println(5);
//		}
			
//		정답
//		3
//		5
	}
	
	static void method1()
	{
		try
		{
			method2();
			System.out.println(1);
		}
		catch(ArithmeticException e)
		{
			System.out.println(2);
		}
		finally
		{
			System.out.println(3);
		}
		
		System.out.println(4);
	}
	
	static void method2()
	{
		throw new NullPointerException();
	}
	
	static void Example07()
	{
//		아래의 코드가 수행되었을 때의 실행결과를 적으시오.
		
		method_(true);
		method_(false);
		
//		정답
//		1
	}
	
	static void method_(boolean b)
	{
		try
		{
			System.out.println(1);
			if(b)
			{
				System.exit(0);
			}
			System.out.println(2);
		}
		catch(RuntimeException r)
		{
			System.out.println(3);
			return;
		}
//		catch(Exception e)
//		{
//			System.out.println(4);
//			return;
//		}
		finally
		{
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	static void Example08()
	{
//		다음은 1~100사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외이다.
//		예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 보완하라.
		
//		1과 100사이의 값을 입력하세요 :50
//		더 작은 수를 입력하세요.
//		1과 100사이의 값을 입력하세요 :asdf
//		Exception in thread "main" java.util.InputMismatchException
//			at java.util.Scanner.throwFor(Scanner.java:819)
//			at java.util.Scanner.next(Scanner.java:1431)
//			at java.util.Scanner.nextInt(Scanner.java:2040)
//			at java.util.Scanner.nextInt(Scanner.java:2000)
//			at Exercise8_8.main(Exercise8_8.java:16)
		
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		do
		{
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			try
			{
				input = new Scanner(System.in).nextInt();
			}
			catch (java.lang.Exception e)
			{
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				continue;
			}
			
			if(answer > input)
			{
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if(answer < input)
			{
				System.out.println("더 작은 수를 입력하세요.");
			}
			else
			{
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			}
		}
		while(true);
	}
	
	static void Example09()
	{
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}
	
	static void Example10()
	{
//		아래의 코드가 수행되었을 때의 실행결과를 적으시오.
		
//		try
//		{
//			method1_();
//			System.out.println(6);
//		}
//		catch(Exception e)
//		{
//			System.out.println(7);
//		}
		
//		정답
//		2
//		4
//		7
	}
	
//	static void method1_() throws Exception
//	{
//		try
//		{
//			method2();
//			System.out.println(1);
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(2);
//			throw e;
//		}
//		catch(Exception e)
//		{
//			System.out.println(3);
//		}
//		finally
//		{
//			System.out.println(4);
//		}
//		
//		System.out.println(5);
//	}
	
//	static void method2_()
//	{
//		throw new NullPointerException();
//	}

}


class UnsupportedFuctionException extends RuntimeException
{
	final private int ERR_CODE;
	
	UnsupportedFuctionException(String msg)
	{
		super(msg);
		ERR_CODE = 100;
	}
	
	UnsupportedFuctionException(String msg, int errCode)
	{
		super(msg);
		ERR_CODE = errCode;
	}
	
	public int getErrorCode()
	{
		return ERR_CODE;
	}
	
	public String getMessage()
	{
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}
