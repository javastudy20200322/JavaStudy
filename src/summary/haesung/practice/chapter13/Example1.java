package summary.haesung.practice.chapter13;

/**
 * <pre>
 * Date		: 2020. 6. 6.
 * Author 	: pureboyz
 * 
 * 쓰레드를 구현하는 방법에는 Thread클래스로부터 상속받는 것과 Runnable인터페이스를 구현하는 것 두 가지가 있는데,
 * 다음의 코드는 Thread클래스를 상속받아서 쓰레드를 구현한 것이다.
 * 이 코드를 Runnable인터페이스를 구현하도록 변경하시오.
 * </pre>
 */
public class Example1
{

	public static void main(String[] args) 
	{
//		Thread1 th1 = new Thread1();
//		th1.start();
		
		// Runnable 인터페이스를 구현한 클래스를 만들고, Thread의 매개변수로 넣어서 실행.
		Runnable1 r1 = new Runnable1();
		new Thread(r1).start();
	}

}

class Runnable1 implements Runnable
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print("-");
		}
	}
}

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print("-");
		}
	}
}
